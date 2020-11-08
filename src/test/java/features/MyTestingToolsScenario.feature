@smoke
Feature: First running test to open browser window

  @smoke1
  Scenario: User can run the test with Selenium
    Given Environment is correctly configured
    When User run the test
    Then Browser window will popup

  @retest
  Scenario: User can interact with web elements on the page
    Given Environment is correctly configured
    When User run the test
    Then Value can be read from label
    And Value can be read from the input field
