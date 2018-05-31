package com.ramakant.demo.test.acceptance;

import com.ramakant.demo.service.models.ReportItem;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class StepBase {
    protected String responseBody;
    protected int responseCode;
    private HttpUrl.Builder urlBuilder;
    private OkHttpClient restClient;

    public StepBase() {
        urlBuilder = new HttpUrl.Builder()
                .scheme("http")
                .host("localhost")
                .port(8080);
        restClient = new OkHttpClient();
    }

    public void getAllReports() {
        urlBuilder.addPathSegments("reports");
        callApi();
    }

    public void getReportsByMonth(String month) {
        urlBuilder.addPathSegments("reports/month");
        urlBuilder.addPathSegments(month);
        callApi();
    }

    public void getReportsBySite(String site) {
        urlBuilder.addPathSegments("reports/site");
        urlBuilder.addPathSegments(site);
        callApi();
    }

    public void getReportByMonthAndSite(String month, String site) {
        urlBuilder.addPathSegments("reports/month");
        urlBuilder.addPathSegments(month);
        urlBuilder.addPathSegments("site");
        urlBuilder.addPathSegments(site);
        callApi();
    }

    public void getAggregateReportByMonth(String month) {
        urlBuilder.addPathSegments("reports/aggregate");
        urlBuilder.addPathSegments("month");
        urlBuilder.addPathSegments(month);
        callApi();
    }

    public void getAggregateReportBySite(String site) {
        urlBuilder.addPathSegments("reports/aggregate");
        urlBuilder.addPathSegments("site");
        urlBuilder.addPathSegments(site);
        callApi();
    }

    private void callApi() {
        Request.Builder requestBuilder = new Request.Builder()
                .url(urlBuilder.build())
                .method("GET", null);
        try (Response response = restClient.newCall(requestBuilder.build()).execute()) {
            responseBody = response.body().string();
            responseCode = response.code();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
