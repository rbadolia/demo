package com.ramakant.demo.persistence;

import com.ramakant.demo.persistence.entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportEntityRepository extends JpaRepository<ReportEntity, Long> {
    List<ReportEntity> findAll();
    List<ReportEntity> findByReportIdMonth(int month);
    List<ReportEntity> findByReportIdSite(String site);
    List<ReportEntity> findByReportIdMonthAndReportIdSite(int month, String site);
}
