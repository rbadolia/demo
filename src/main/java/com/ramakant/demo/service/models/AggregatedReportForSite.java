package com.ramakant.demo.service.models;

import com.ramakant.demo.common.SiteMap;

public class AggregatedReportForSite {

    private String site;
    private double requests;
    private double impressions;
    private double clicks;
    private double conversions;
    private double revenue;
    private double ctr;
    private double cr;
    private double fillRate;
    private double ecpm;

    public AggregatedReportForSite(String site, double requests, double impressions, double clicks, double conversions, double revenue) {
        this.site = SiteMap.siteNameToSiteIdMap.get(site);
        this.requests = requests;
        this.impressions = impressions;
        this.clicks = clicks;
        this.conversions = conversions;
        this.revenue = revenue;
        this.ctr = (this.clicks / this.impressions) * 100;
        this.cr = (this.conversions / this.impressions) * 100;
        this.fillRate = (this.impressions / this.requests) * 100;
        this.ecpm = (this.revenue * 1000) / this.impressions;
    }


    public String getSite() {
        return site;
    }

    public double getRequests() {
        return this.requests;
    }

    public double getImpressions() {
        return this.impressions;
    }

    public double getClick() {
        return this.clicks;
    }

    public double getConversions() {
        return this.conversions;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public double getCtr() {
        return this.ctr;
    }

    public double getCr() {
        return this.cr;
    }

    public double getFillRate() {
        return this.fillRate;
    }

    public double getEcpm() {
        return this.ecpm;
    }
}
