Feature: Slack Message

  Scenario: Send Harsh a message on Slack
    Given I am on sign in page of Slack
    When I sign into my workspace
    When I enter email "<email>" and "<password>"
    And I search for Harsh and click message
    Then I type a message and hit send
