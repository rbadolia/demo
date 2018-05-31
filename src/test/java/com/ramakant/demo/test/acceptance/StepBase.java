package com.ramakant.demo.test.acceptance;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

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

    public void getAllReports(){
        urlBuilder.addPathSegments("reports");
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
