Feature: Login into the lumu portal

  Scenario: Successful login
    Given Diego has an active account
    When He sends their valid credentials
    Then He should have access to the company activity

