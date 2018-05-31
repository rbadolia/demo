package com.ramakant.demo.service;

import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.ReportItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<ReportItem> getAllReports();
    List<ReportItem> getReportsForMonth(String month);
    List<ReportItem> getReportsForSite(String site);
    List<ReportItem> getReportsForMonthAndSite(String month, String site);
    AggregatedReportForMonth getReportForMonth(String month);
    AggregatedReportForSite getReportForSite(String site);

}
