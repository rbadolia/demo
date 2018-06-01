$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("report-api.feature");
formatter.feature({
  "line": 1,
  "name": "To test report api",
  "description": "",
  "id": "to-test-report-api",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Invalid month",
  "description": "",
  "id": "to-test-report-api;invalid-month",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I request to get report with month as 13",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I get the response status as 400",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 330891015,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 48823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "13",
      "offset": 38
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithMonthAs(String)"
});
formatter.result({
  "duration": 65215844,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 691769,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Invalid site",
  "description": "",
  "id": "to-test-report-api;invalid-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I request to get report with site as abc",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I get the response status as 400",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 2789840,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 14006,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithSiteAsAbc(String)"
});
formatter.result({
  "duration": 3446971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 134050,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Valid month as number",
  "description": "",
  "id": "to-test-report-api;valid-month-as-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I request to get report with month as 1",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "the number of records returned are 4",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1794098,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 38
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithMonthAs(String)"
});
formatter.result({
  "duration": 5285095,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 161789,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 263745660,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Valid month as first 3 letters of month",
  "description": "",
  "id": "to-test-report-api;valid-month-as-first-3-letters-of-month",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I request to get report with month as JAN",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "the number of records returned are 4",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 2750167,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 53940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JAN",
      "offset": 38
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithMonthAs(String)"
});
formatter.result({
  "duration": 4624138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 100915,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 602696,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Valid month as full month name",
  "description": "",
  "id": "to-test-report-api;valid-month-as-full-month-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I request to get report with month as JANUARY",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "the number of records returned are 4",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 2498594,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 17965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JANUARY",
      "offset": 38
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithMonthAs(String)"
});
formatter.result({
  "duration": 7009185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 106264,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 688423,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Valid site desktop",
  "description": "",
  "id": "to-test-report-api;valid-site-desktop",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I request to get report with site as desktop_web",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "the number of records returned are 2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1329277,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15158,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desktop_web",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithSiteAsAbc(String)"
});
formatter.result({
  "duration": 7187415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 111227,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 463197,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Valid site android",
  "description": "",
  "id": "to-test-report-api;valid-site-android",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I request to get report with site as android",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "the number of records returned are 2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1484408,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithSiteAsAbc(String)"
});
formatter.result({
  "duration": 5682726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 103802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 693892,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Valid site mobile",
  "description": "",
  "id": "to-test-report-api;valid-site-mobile",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I request to get report with site as mobile_web",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "the number of records returned are 2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1118337,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 30534,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobile_web",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithSiteAsAbc(String)"
});
formatter.result({
  "duration": 4267140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 98072,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 525613,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Valid site ios",
  "description": "",
  "id": "to-test-report-api;valid-site-ios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I request to get report with site as iOS",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "the number of records returned are 2",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1928528,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 26801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iOS",
      "offset": 37
    }
  ],
  "location": "StepDefinitions.iRequestToGetReportWithSiteAsAbc(String)"
});
formatter.result({
  "duration": 5266656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 99887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 35
    }
  ],
  "location": "StepDefinitions.theNumberOfRecordsReturnedAre(int)"
});
formatter.result({
  "duration": 778681,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "Aggregated report by month",
  "description": "",
  "id": "to-test-report-api;aggregated-report-by-month",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 65,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I request to get aggregated report with month as 1",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "the aggregated report for month JANUARY is returned",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1767183,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 58120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 49
    }
  ],
  "location": "StepDefinitions.iRequestToGetAggregatedReportWithMonthAs(String)"
});
formatter.result({
  "duration": 6320316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 145465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JANUARY",
      "offset": 32
    }
  ],
  "location": "StepDefinitions.theAggregatedReportForMonthIsReturned(String)"
});
formatter.result({
  "duration": 12747450,
  "status": "passed"
});
formatter.scenario({
  "line": 71,
  "name": "Aggregated report by site",
  "description": "",
  "id": "to-test-report-api;aggregated-report-by-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 72,
  "name": "the report api is running",
  "keyword": "Given "
});
formatter.step({
  "line": 73,
  "name": "file data is ingested in database",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "I request to get aggregated report with site as android",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "I get the response status as 200",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "the aggregated report for site android is returned",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.the_report_api_is_running()"
});
formatter.result({
  "duration": 1371540,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 48
    }
  ],
  "location": "StepDefinitions.iRequestToGetAggregatedReportWithSiteAsAndroid(String)"
});
formatter.result({
  "duration": 7702835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitions.i_get_the_response_status_as(int)"
});
formatter.result({
  "duration": 144679,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "android",
      "offset": 31
    }
  ],
  "location": "StepDefinitions.theAggregatedReportForSiteAndroidIsReturned(String)"
});
formatter.result({
  "duration": 2982272,
  "status": "passed"
});
});