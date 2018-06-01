package com.ramakant.demo.service;

import com.ramakant.demo.common.MonthMaps;
import com.ramakant.demo.persistence.entities.ReportEntity;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.ReportItemForAggregation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportAggregatorServiceImpl implements ReportAggregatorService {
    @Override
    public AggregatedReportForMonth AggregateOnMonth(List<ReportEntity> items, int month) {

        if (items != null) {
            List<ReportEntity> allSitesItemsForTheMonth = items.stream().filter(i -> i.getReportId().getMonth() == month).collect(Collectors.toList());
            ReportItemForAggregation aggregatedItem = getTotal(allSitesItemsForTheMonth);
            return new AggregatedReportForMonth(MonthMaps.monthIdToMonthMap.get(month), aggregatedItem.getRequests(), aggregatedItem.getImpressions(), aggregatedItem.getClicks(), aggregatedItem.getConversions(), aggregatedItem.getRevenue());
        }

        return null;
    }

    @Override
    public AggregatedReportForSite AggregateOnSite(List<ReportEntity> items, String site) {
        if (items != null) {

            List<ReportEntity> allMonthsItemsForTheSite = items.stream().filter(i -> i.getReportId().getSite().equals(site)).collect(Collectors.toList());
            ReportItemForAggregation aggregatedItem = getTotal(allMonthsItemsForTheSite);
            return new AggregatedReportForSite(site, aggregatedItem.getRequests(), aggregatedItem.getImpressions(), aggregatedItem.getClicks(), aggregatedItem.getConversions(), aggregatedItem.getRevenue());
        }

        return null;
    }

    private ReportItemForAggregation getTotal(List<ReportEntity> items) {
        double totalRequests = 0;
        double totalImpressions = 0;
        double totalClicks = 0;
        double totalConversions = 0;
        double totalRevenue = 0;

        for (ReportEntity item : items) {
            totalRequests = totalRequests + item.getRequests();
            totalImpressions = totalImpressions + item.getImpressions();
            totalClicks = totalClicks + item.getClicks();
            totalConversions = totalConversions + item.getConversions();
            totalRevenue = totalRevenue + item.getRequests();
        }

        return new ReportItemForAggregation(totalRequests, totalImpressions, totalClicks, totalConversions, totalRevenue);
    }
}
