Feature: LoginFeature
  This feature details the login functionality of the e-commerce aplication

  Background: Possibility to access the system

  Scenario: Login with correct email and password
    Given I navigate to the login page
    And I enter the email as "marcy.ifpe@gmail.com" and the password as "teste12@"
    And I click login button
    Then I should see the My Account page