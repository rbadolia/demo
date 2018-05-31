package com.ramakant.demo.service;

import com.ramakant.demo.common.MonthMaps;
import com.ramakant.demo.common.SiteMap;
import com.ramakant.demo.exception.MonthNotFoundException;
import com.ramakant.demo.exception.SiteNotFoundException;
import com.ramakant.demo.persistence.ReportEntityRepository;
import com.ramakant.demo.persistence.entities.ReportEntity;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.ReportItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportAggregatorService reportAggregatorService;

    @Autowired
    private ReportEntityRepository reportEntityRepository;

    @Override
    public List<ReportItem> getAllReports() {
        List<ReportEntity> entities = reportEntityRepository.findAll();
        return mapIntoReportItem(entities);
    }

    @Override
    public List<ReportItem> getReportsForMonth(String month) {
        if (!MonthMaps.monthToIdMap.containsKey(month.toUpperCase())) {
            throw new MonthNotFoundException("Invalid month value");
        }

        int monthIndex = MonthMaps.monthToIdMap.get(month.toUpperCase());
        List<ReportEntity> entities = reportEntityRepository.findByReportIdMonth(monthIndex);
        return mapIntoReportItem(entities);
    }

    @Override
    public List<ReportItem> getReportsForSite(String site) {
        if (!SiteMap.siteIdToSiteNameMap.containsKey(site.toLowerCase())) {
            throw new SiteNotFoundException("Invalid site value");
        }

        String siteName = SiteMap.siteIdToSiteNameMap.get(site.toLowerCase());
        List<ReportEntity> entities = reportEntityRepository.findByReportIdSite(siteName);
        return mapIntoReportItem(entities);
    }

    @Override
    public List<ReportItem> getReportsForMonthAndSite(String month, String site) {
        if (!MonthMaps.monthToIdMap.containsKey(month.toUpperCase())) {
            throw new MonthNotFoundException("Invalid month value");
        }

        if (!SiteMap.siteIdToSiteNameMap.containsKey(site.toLowerCase())) {
            throw new SiteNotFoundException("Invalid site value");
        }

        int monthIndex = MonthMaps.monthToIdMap.get(month.toUpperCase());
        String siteName = SiteMap.siteIdToSiteNameMap.get(site.toLowerCase());
        List<ReportEntity> entities = reportEntityRepository.findByReportIdMonthAndReportIdSite(monthIndex, siteName);
        return mapIntoReportItem(entities);
    }

    @Override
    public AggregatedReportForMonth getReportForMonth(String month) {
        if (!MonthMaps.monthToIdMap.containsKey(month.toUpperCase())) {
            throw new MonthNotFoundException("Invalid month value");
        }

        int monthIndex;
        monthIndex = MonthMaps.monthToIdMap.get(month.toUpperCase());
        List<ReportEntity> items = reportEntityRepository.findByReportIdMonth(monthIndex);
        return reportAggregatorService.AggregateOnMonth(items, monthIndex);
    }

    @Override
    public AggregatedReportForSite getReportForSite(String site) {
        if (!SiteMap.siteIdToSiteNameMap.containsKey(site.toLowerCase())) {
            throw new SiteNotFoundException("Invalid site value");
        }

        String siteName = SiteMap.siteIdToSiteNameMap.get(site.toLowerCase());
        List<ReportEntity> items = reportEntityRepository.findByReportIdSite(siteName);

        return reportAggregatorService.AggregateOnSite(items, siteName);
    }

    private List<ReportItem> mapIntoReportItem(List<ReportEntity> entities) {
        List<ReportItem> items = new ArrayList<>();

        for (ReportEntity entity : entities) {
            ReportItem item = new ReportItem(
                    entity.getReportId().getYear(),
                    MonthMaps.monthIdToMonthMap.get(entity.getReportId().getMonth()),
                    entity.getReportId().getSite(),
                    entity.getRequests(),
                    entity.getImpressions(),
                    entity.getClicks(),
                    entity.getConversions(),
                    entity.getRevenue());

            items.add(item);
        }

        return items;
    }
}
