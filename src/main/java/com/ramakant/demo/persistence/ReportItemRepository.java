package com.ramakant.demo.persistence;

import com.ramakant.demo.domain.ReportItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportItemRepository extends JpaRepository<ReportItem, Long> {
    List<ReportItem> findAllByOrderByMonthAsc();
    List<ReportItem> findByMonth(int month);
    List<ReportItem> findBySite(String site);
    List<ReportItem> findByMonthAndSite(int month, String site);
}
