Feature: Validate checkout functionality
  Scenario: verify checkout
    Given user opens the application
    Then verify user is on login page
    And user enters username and password
    When user click on login button
    Then verify user is on home page
    And user click on an element
    And click on add to cart button
    When user click on add to cart icon
    Then verify user is on cart page
    And user click on checkout button
    And user enter address
    When click on continue button
    Then verify user is on checkout page
    When click on finish button
    Then verify successfull message is displayed
    |successful|