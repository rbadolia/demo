package com.ramakant.demo.persistence.entities;

import com.ramakant.demo.common.MonthMaps;
import com.ramakant.demo.common.SiteMap;
import com.ramakant.demo.exception.DemoException;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class ReportId implements Serializable {

    private static final long serialVersionUID = 5316731204947357898L;

    @Column
    @NotNull
    private int year;

    @Column
    @NotNull
    private int month;

    @Column
    @NotNull
    private String site;

    public ReportId() {
    }

    public ReportId(@NotNull int year, @NotNull int month, @NotNull String site) {
        this.year = year;

        if (!MonthMaps.monthIdToMonthMap.containsKey(month)) {
            throw new DemoException("Invalid month");
        }

        this.month = month;

        if (!SiteMap.siteNameToSiteIdMap.containsKey(site)) {
            throw new DemoException("Invalid site");
        }
        this.site = site;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public String getSite() {
        return this.site;
    }
}
