package com.ramakant.demo.rest;

import com.ramakant.demo.service.ReportAggregatorServiceImpl;
import com.ramakant.demo.service.ReportService;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.ReportItem;
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
    private ReportService reportService;

    @GetMapping("/reports")
    public List<ReportItem> getAllReports() {
        return reportService.getAllReports();
    }

    @GetMapping({
            "/reports/month/{monthName}/site/{siteName}",
            "/reports/site/{siteName}/month/{monthName}"
    })
    public List<ReportItem> getReports(
            @PathVariable("monthName") String month,
            @PathVariable("siteName") String site
    ) {
        return reportService.getReportsForMonthAndSite(month, site);
    }

    @GetMapping("/reports/month/{monthName}")
    public AggregatedReportForMonth getReportsByMonth(
            @PathVariable("monthName") String month
    ) {
        return reportService.getReportForMonth(month);
    }

    @GetMapping("/reports/site/{siteName}")
    public AggregatedReportForSite getReportsBySite(
            @PathVariable("siteName") String site
    ) {
        return reportService.getReportForSite(site);
    }
}
