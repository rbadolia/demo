package com.ramakant.demo.service.models;

public class ReportItemForAggregation {
    private double requests;
    private double impressions;
    private double clicks;
    private double conversions;
    private double revenue;

    public ReportItemForAggregation(double totalRequests, double totalImpressions, double totalClicks, double totalConversions, double totalRevenue) {
        this.requests = totalRequests;
        this.impressions = totalImpressions;
        this.clicks = totalClicks;
        this.conversions = totalConversions;
        this.revenue = totalRevenue;
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
}
