Feature: Validate context switching functionality
  Scenario: verify context switching
    Given user opens the application
    Then verify user is on login page
    And user enters username and password
    When user click on login button
    Then verify user is on home page
    And click on burger menu icon
    When click on webView
    Then verify user on webView page
    And enter the website
    When click on go to website
    Then verify context