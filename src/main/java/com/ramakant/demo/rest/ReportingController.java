package com.ramakant.demo.rest;

import com.ramakant.demo.domain.AllMonthsReportItem;
import com.ramakant.demo.domain.AllSitesReportItem;
import com.ramakant.demo.domain.ReportItem;
import com.ramakant.demo.domain.ReportItemAggregator;
import com.ramakant.demo.persistence.ReportItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReportingController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private final Map<String, Integer> monthMap;
    private final ReportItemAggregator reportItemAggregator;

    public ReportingController(){
        LOGGER.debug("Initialising month map...");
        monthMap = new HashMap<>();
        monthMap.put("1", 1);
        monthMap.put("2", 2);
        monthMap.put("3", 3);
        monthMap.put("4", 4);
        monthMap.put("5", 5);
        monthMap.put("6", 6);
        monthMap.put("7", 7);
        monthMap.put("8", 8);
        monthMap.put("9", 9);
        monthMap.put("10", 10);
        monthMap.put("11", 11);
        monthMap.put("12", 12);
        monthMap.put("JAN", 1);
        monthMap.put("FEB", 2);
        monthMap.put("MAR", 3);
        monthMap.put("APR", 4);
        monthMap.put("MAY", 5);
        monthMap.put("JUN", 6);
        monthMap.put("JUL", 7);
        monthMap.put("AUG", 8);
        monthMap.put("SEP", 9);
        monthMap.put("OCT", 10);
        monthMap.put("NOV", 11);
        monthMap.put("DEC", 12);
        monthMap.put("JANUARY", 1);
        monthMap.put("FEBRUARY", 2);
        monthMap.put("MARCH", 3);
        monthMap.put("APRIL", 4);
        monthMap.put("JUNE", 6);
        monthMap.put("JULY", 7);
        monthMap.put("AUGUST", 8);
        monthMap.put("SEPTEMBER", 9);
        monthMap.put("OCTOBER", 10);
        monthMap.put("NOVEMBER", 11);
        monthMap.put("DECEMBER", 12);
        LOGGER.debug("Initialised month map...");

        reportItemAggregator = new ReportItemAggregator();
    }

    @Autowired
    private ReportItemRepository reportItemRepository;

    @GetMapping("/reports")
    public List<ReportItem> GetAllReports() {
        LOGGER.info("Getting all report items from db...");
        return reportItemRepository.findAllByOrderByMonthAsc();
    }

    @GetMapping({
            "/reports/month/{monthName}/site/{siteName}",
            "/reports/site/{siteName}/month/{monthName}"
    })
    public List<ReportItem> GetReports(
            @PathVariable("monthName") String month,
            @PathVariable("siteName") String site
    ) {

        LOGGER.info("Getting all report items from db for the given month and site...");

        int monthIndex = monthMap.get(month.toUpperCase());
        return reportItemRepository.findByMonthAndSite(monthIndex, site);
    }

    @GetMapping("/reports/month/{monthName}")
    public AllSitesReportItem GetReportsByMonth(
            @PathVariable("monthName") String month
    ) {

        LOGGER.info("Getting aggregated report for given month from db...");

        int monthIndex;

        monthIndex = monthMap.get(month.toUpperCase());
        List<ReportItem> items = reportItemRepository.findByMonth(monthIndex);
        return reportItemAggregator.AggregateOnMonth(items, monthIndex);
    }

    @GetMapping("/reports/site/{siteName}")
    public AllMonthsReportItem GetReportsBySite(
            @PathVariable("siteName") String site
    ) {
        LOGGER.info("Getting aggregated report for given site from db...");

        List<ReportItem> items = reportItemRepository.findBySite(site);
        return reportItemAggregator.AggregateOnSite(items, site);
    }
}
