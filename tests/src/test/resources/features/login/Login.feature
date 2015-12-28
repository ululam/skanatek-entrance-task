Feature: Log in to web application
  In order to protect sensitive data
  As a system administrator
  I want the system to accept only authorized users

  @Chrome
  Scenario: Basic login into the user's area
    Given I visit 'http://localhost:8000'
    When I log in using email 'alexey.zakharchenko@gmail.com' and password 'top_secret_password_124'
    Then I should see the text 'Welcome, Alexey Zakharchenko'