Feature: Validate Add to cart functionality
  Scenario: verify add to cart
    Given user opens the application
    Then verify user is on login page
    And user enters username and password
    When user click on login button
    Then verify user is on home page
    And print product names