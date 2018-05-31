package com.ramakant.demo.rest;

import com.ramakant.demo.common.MonthMaps;
import com.ramakant.demo.common.SiteMap;
import com.ramakant.demo.exception.MonthNotFoundException;
import com.ramakant.demo.exception.SiteNotFoundException;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.persistence.entities.ReportEntity;
import com.ramakant.demo.service.ReportAggregatorServiceImpl;
import com.ramakant.demo.exception.DemoException;
import com.ramakant.demo.persistence.ReportItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportingController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ReportAggregatorServiceImpl reportItemAggregatorService;

    @Autowired
    private ReportItemRepository reportItemRepository;

    @GetMapping("/reports")
    public List<ReportEntity> getAllReports() {
        LOGGER.info("Getting all report items from db...");
        return reportItemRepository.findAll();
    }

    @GetMapping({
            "/reports/month/{monthName}/site/{siteName}",
            "/reports/site/{siteName}/month/{monthName}"
    })
    public List<ReportEntity> getReports(
            @PathVariable("monthName") String month,
            @PathVariable("siteName") String site
    ) {

        LOGGER.info("Getting all report items from db for the given month and site...");

        if(!MonthMaps.monthToIdMap.containsKey(month.toUpperCase())){
            throw new MonthNotFoundException("Invalid month value");
        }

        if(!SiteMap.siteIdToSiteNameMap.containsKey(site.toLowerCase())){
            throw new SiteNotFoundException("Invalid site value");
        }

        int monthIndex = MonthMaps.monthToIdMap.get(month.toUpperCase());
        String siteName = SiteMap.siteIdToSiteNameMap.get(site.toLowerCase());
        return reportItemRepository.findByReportIdMonthAndReportIdSite(monthIndex, siteName);
    }

    @GetMapping("/reports/month/{monthName}")
    public AggregatedReportForMonth getReportsByMonth(
            @PathVariable("monthName") String month
    ) {

        LOGGER.info("Getting aggregated report for given month from db...");

        if(!MonthMaps.monthToIdMap.containsKey(month.toUpperCase())){
            throw new MonthNotFoundException("Invalid month value");
        }

        int monthIndex;
        monthIndex = MonthMaps.monthToIdMap.get(month.toUpperCase());
        List<ReportEntity> items = reportItemRepository.findByReportIdMonth(monthIndex);
        return reportItemAggregatorService.AggregateOnMonth(items, monthIndex);
    }

    @GetMapping("/reports/site/{siteName}")
    public AggregatedReportForSite getReportsBySite(
            @PathVariable("siteName") String site
    ) {
        LOGGER.info("Getting aggregated report for given site from db...");

        if(!SiteMap.siteIdToSiteNameMap.containsKey(site.toLowerCase())){
            throw new SiteNotFoundException("Invalid site value");
        }

        String siteName = SiteMap.siteIdToSiteNameMap.get(site.toLowerCase());
        List<ReportEntity> items = reportItemRepository.findByReportIdSite(siteName);

        return reportItemAggregatorService.AggregateOnSite(items, siteName);
    }
}
