package com.ramakant.demo.service;

import com.ramakant.demo.persistence.entities.ReportEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<ReportEntity> getReports(String month, String site);
}
