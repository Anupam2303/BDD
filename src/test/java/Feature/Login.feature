Feature: LoginFeature
  Deals with login

  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter user email address as Email:anupam.rai
    And I verify the count of my salary digits for rs 1000
    And I enter following details for login
      | UserName  | Password  |
      | admin     | adminpass |
      | Frontdesk | Fpass     |
    And I click login button
    Then  I should see the userform page

  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to login page
    And I enter <username> and <password> for login
    Then  I should see the userform page

    Examples:
      | username | password |
      | Answer   | question |
      | line     | voice    |
      | whatsapp | message  |