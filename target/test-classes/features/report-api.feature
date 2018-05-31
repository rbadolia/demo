Feature: To test report api

  Scenario: Get all reports
    Given the csv data as below
    When I request to get all reports
    Then I get the response status as 200
    And all the items as mentioned in the csv data