Feature: To test report api

  Scenario: Invalid month
    Given the report api is running
    And file data is ingested in database
    When I request to get report with month as 13
    Then I get the response status as 400

  Scenario: Invalid site
    Given the report api is running
    And file data is ingested in database
    When I request to get report with site as abc
    Then I get the response status as 400

  Scenario: Valid month as number
    Given the report api is running
    And file data is ingested in database
    When I request to get report with month as 1
    Then I get the response status as 200
    And the number of records returned are 4

  Scenario: Valid month as first 3 letters of month
    Given the report api is running
    And file data is ingested in database
    When I request to get report with month as JAN
    Then I get the response status as 200
    And the number of records returned are 4

  Scenario: Valid month as full month name
    Given the report api is running
    And file data is ingested in database
    When I request to get report with month as JANUARY
    Then I get the response status as 200
    And the number of records returned are 4

  Scenario: Valid site desktop
    Given the report api is running
    And file data is ingested in database
    When I request to get report with site as desktop_web
    Then I get the response status as 200
    And the number of records returned are 2

  Scenario: Valid site android
    Given the report api is running
    And file data is ingested in database
    When I request to get report with site as android
    Then I get the response status as 200
    And the number of records returned are 2

  Scenario: Valid site mobile
    Given the report api is running
    And file data is ingested in database
    When I request to get report with site as mobile_web
    Then I get the response status as 200
    And the number of records returned are 2

  Scenario: Valid site ios
    Given the report api is running
    And file data is ingested in database
    When I request to get report with site as iOS
    Then I get the response status as 200
    And the number of records returned are 2

  Scenario: Aggregated report by month
    Given the report api is running
    And file data is ingested in database
    When I request to get aggregated report with month as 1
    Then I get the response status as 200
    And the aggregated report for month JANUARY is returned

  Scenario: Aggregated report by site
    Given the report api is running
    And file data is ingested in database
    When I request to get aggregated report with site as android
    Then I get the response status as 200
    And the aggregated report for site android is returned
