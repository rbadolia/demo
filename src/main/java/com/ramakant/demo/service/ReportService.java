package com.ramakant.demo.service;

import com.ramakant.demo.persistence.entities.ReportEntity;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<ReportEntity> getAllReports();
    List<ReportEntity> getReportsForMonthAndSite(String month, String site);
    AggregatedReportForMonth getReportForMonth(String month);
    AggregatedReportForSite getReportForSite(String site);
}
