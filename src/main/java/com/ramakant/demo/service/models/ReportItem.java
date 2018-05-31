package com.ramakant.demo.service.models;

import com.ramakant.demo.common.Round;

public class ReportItem {
    private int year;
    private String month;
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

    protected ReportItem() {
    }

    public ReportItem(int year, String month, String site, double requests, double impressions, double clicks, double conversions, double revenue) {
        this.year = year;
        this.month = month;
        this.site = site;
        this.requests = requests;
        this.impressions = impressions;
        this.clicks=clicks;
        this.conversions=conversions;
        this.revenue=revenue;
        this.ctr = Round.getRoundedDouble((clicks / impressions) * 100, 2);
        this.cr = Round.getRoundedDouble((conversions / impressions) * 100, 2);
        this.fillRate = Round.getRoundedDouble((impressions / requests) * 100, 2);
        this.ecpm = Round.getRoundedDouble((revenue * 1000) / impressions,2);
    }

    public int getYear() {
        return this.year;
    }

    public String getMonth(){
        return this.month;
    }

    public String getSite() {
        return this.site;
    }

    public double getRequests() {
        return this.requests;
    }

    public double getImpressions() {
        return this.impressions;
    }

    public double getClicks() {
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
