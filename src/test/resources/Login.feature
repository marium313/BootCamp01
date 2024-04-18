#Feature: Login to Orange HRM
#
#  Background: User is on OrangeHRM Demo Login page. User enters correct username and password
#    should be able to login and user enter incorrect password and username should be getting a message
#    as Invalid credentials
#
#  Scenario Outline: Login into Orange HRM
#    Given I am on the OrangeHRM login page
#    When I enter username "<username>" and "<password>"
#    And I click on the login button
#    Then I should be <outcome>
#    But user to verify that the user is logged in
#
#    Examples:
#    | username | password | outcome |
#    | Admin    | admin123 | logged in |
#    | WrongUser| user123  | not logged in |
#    | Admin    | guest123 | not logged in |
