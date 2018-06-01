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
  "duration": 364403111,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 14398,
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
  "duration": 43409964,
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
  "duration": 779897,
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
  "duration": 2292477,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 18792,
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
  "duration": 3627411,
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
  "duration": 128282,
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
  "duration": 1588639,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 13840,
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
  "duration": 5116165,
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
  "duration": 149645,
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
  "duration": 349150025,
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
  "duration": 3619555,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15298,
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
  "duration": 5761870,
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
  "duration": 105167,
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
  "duration": 638085,
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
  "duration": 2498835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 18185,
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
  "duration": 5541061,
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
  "duration": 118040,
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
  "duration": 665240,
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
  "duration": 1388665,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15121,
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
  "duration": 4681711,
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
  "duration": 97517,
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
  "duration": 410957,
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
  "duration": 1204230,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 13236,
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
  "duration": 7086366,
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
  "duration": 88168,
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
  "duration": 700082,
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
  "duration": 1133716,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 12718,
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
  "duration": 5422641,
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
  "duration": 103226,
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
  "duration": 436067,
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
  "duration": 1050397,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 15635,
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
  "duration": 5029224,
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
  "duration": 112237,
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
  "duration": 423324,
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
  "duration": 1066818,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 22537,
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
  "duration": 5121967,
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
  "duration": 91157,
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
  "duration": 10780207,
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
  "duration": 1089656,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.file_data_is_ingested_in_database()"
});
formatter.result({
  "duration": 18898,
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
  "duration": 5503444,
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
  "duration": 95858,
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
  "duration": 2758844,
  "status": "passed"
});
});