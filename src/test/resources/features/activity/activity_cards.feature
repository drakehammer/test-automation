Feature: Check the activity page

  Scenario Outline: Check queries analyzed
    Given Diego has an active account
    And He sends their valid credentials
    And He should have access to the company activity
    When Diego is in the activity page
    Then He check the <card> card has <value> contacts
    Examples:
      | card         | value |
      | All Traffic  | 3.59K |
      | Malware      | 0     |
      | Phishing     | 10    |
      | C&C          | 0     |
      | Network Scan | 0     |
      | Other        | 3     |


