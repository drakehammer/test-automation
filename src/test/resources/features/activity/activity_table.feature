Feature: Check the activity table

  Scenario: Check activity detail table filtered by domain
    Given Diego has an active account
    And He sends their valid credentials
    And He should have access to the company activity
    When Diego is in the activity page
    When He filter the activity details table by domain www2.etc.meaisoacio.com
    Then He see the data associated to that domain


  Scenario: Check activity detail table filtered by Type
    Given Diego has an active account
    And He sends their valid credentials
    And He should have access to the company activity
    When Diego is in the activity page
    When He filter the activity details table by phishing type
    Then He see the activity details table associated to that type


  Scenario: Check activity detail table filtered by date
    Given Diego has an active account
    And He sends their valid credentials
    And He should have access to the company activity
    When Diego is in the activity page
    When He filter by date Today
    Then He see the activity details table associated to that date


