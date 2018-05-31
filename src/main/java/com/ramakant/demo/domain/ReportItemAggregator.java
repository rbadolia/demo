package com.ramakant.demo.domain;

import java.util.List;

public class ReportItemAggregator {
    public AllSitesReportItem AggregateOnMonth(List<ReportItem> items, int month){

        if(items != null) {
            double totalRequests = 0;
            double totalImpressions = 0;
            double totalClicks = 0;
            double totalConversions = 0;
            double totalRevenue = 0;

            for(ReportItem item : items){
                totalRequests = totalRequests + item.getRequests();
                totalImpressions = totalImpressions + item.getImpressions();
                totalClicks = totalClicks + item.getClick();
                totalConversions = totalConversions + item.getConversions();
                totalRevenue = totalRevenue + item.getRequests();
            }

            return new AllSitesReportItem(month, totalRequests, totalImpressions, totalClicks, totalConversions, totalRevenue);
        }

        return null;
    }

    public AllMonthsReportItem AggregateOnSite(List<ReportItem> items, String site){
        if(items != null) {
            double totalRequests = 0;
            double totalImpressions = 0;
            double totalClicks = 0;
            double totalConversions = 0;
            double totalRevenue = 0;

            for(ReportItem item : items){
                totalRequests = totalRequests + item.getRequests();
                totalImpressions = totalImpressions + item.getImpressions();
                totalClicks = totalClicks + item.getClick();
                totalConversions = totalConversions + item.getConversions();
                totalRevenue = totalRevenue + item.getRequests();
            }

            return new AllMonthsReportItem(site, totalRequests, totalImpressions, totalClicks, totalConversions, totalRevenue);
        }

        return null;
    }
}
