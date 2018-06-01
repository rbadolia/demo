package com.ramakant.demo.service;

import com.ramakant.demo.persistence.entities.ReportEntity;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportAggregatorService {
    AggregatedReportForMonth AggregateOnMonth(List<ReportEntity> items, int month);

    AggregatedReportForSite AggregateOnSite(List<ReportEntity> items, String site);
}
