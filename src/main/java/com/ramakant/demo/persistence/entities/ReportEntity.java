package com.ramakant.demo.persistence.entities;

import com.ramakant.demo.common.Round;
import org.hibernate.validator.constraints.Range;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class ReportEntity {
    @EmbeddedId
    @NotNull
    private ReportId reportId;

    @Column
    @Range(message = "Positive number of requests")
    private double requests;

    @Range(message = "Positive number of impressions")
    private double impressions;

    @Range(message = "Positive number of clicks")
    private double clicks;

    @Range(message = "Positive number of conversions")
    private double conversions;

    @Range(message = "Positive number of revenue in USD")
    private double revenue;

    private double ctr;
    private double cr;
    private double fillRate;
    private double ecpm;

    protected ReportEntity() {
    }

    public ReportEntity(int year, int month, String site, double requests, double impressions, double clicks, double conversions, double revenue) {
        this.reportId = new ReportId(year, month, site);
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

    public ReportId getReportId(){
        return this.reportId;
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