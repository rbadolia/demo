package com.ramakant.demo.test.acceptance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ramakant.demo.service.models.AggregatedReportForMonth;
import com.ramakant.demo.service.models.AggregatedReportForSite;
import com.ramakant.demo.service.models.ReportItem;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions extends StepBase {

    @After
    public void after() {
    }

    @Before
    public void before() throws Exception {

    }

    @Given("^the report api is running$")
    public void the_report_api_is_running() throws Throwable {

    }

    @Given("^file data is ingested in database$")
    public void file_data_is_ingested_in_database() throws Throwable {

    }

    @When("^I request to get all reports$")
    public void i_request_to_get_all_reports() throws Throwable {
        getAllReports();
    }

    @Then("^I get the response status as (\\d+)$")
    public void i_get_the_response_status_as(int statusCode) throws Throwable {
        assertThat(statusCode).isEqualTo(responseCode);
    }

    @Then("^all the report items$")
    public void all_the_report_items() throws Throwable {
        assertThat(responseBody).isNotEmpty();
    }

    @When("^I request to get report with month as (.*)$")
    public void iRequestToGetReportWithMonthAs(String month) throws Throwable {
        getReportsByMonth(month);
    }

    @When("^I request to get report with site as (.*)$")
    public void iRequestToGetReportWithSiteAsAbc(String site) throws Throwable {
        getReportsBySite(site);
    }

    @And("^the number of records returned are (\\d+)$")
    public void theNumberOfRecordsReturnedAre(int numberOfRecords) throws Throwable {
        List<ReportItem> items = JsonUtils.fromJsonToObject(responseBody, new TypeReference<List<ReportItem>>() {
        });
        assertThat(items.size()).isEqualTo(numberOfRecords);
    }

    @When("^I request to get aggregated report with month as (.*)$")
    public void iRequestToGetAggregatedReportWithMonthAs(String month) throws Throwable {
        getAggregateReportByMonth(month);
    }

    @When("^I request to get aggregated report with site as (.*)$")
    public void iRequestToGetAggregatedReportWithSiteAsAndroid(String site) throws Throwable {
        getAggregateReportBySite(site);
    }

    @And("^the aggregated report for month (.*) is returned$")
    public void theAggregatedReportForMonthIsReturned(String month) throws Throwable {
        AggregatedReportForMonth aggregatedReportForMonth = JsonUtils.fromJsonToObject(responseBody, new TypeReference<AggregatedReportForMonth>() {
        });
        assertThat(aggregatedReportForMonth).isNotNull();
        assertThat(aggregatedReportForMonth.getMonth()).isEqualTo(month);
    }

    @And("^the aggregated report for site (.*) is returned$")
    public void theAggregatedReportForSiteAndroidIsReturned(String site) throws Throwable {
        AggregatedReportForSite aggregatedReportForSite = JsonUtils.fromJsonToObject(responseBody, new TypeReference<AggregatedReportForSite>() {
        });
        assertThat(aggregatedReportForSite).isNotNull();
        assertThat(aggregatedReportForSite.getSite()).isEqualTo(site);
    }
}