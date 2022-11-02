Feature: Symund Login

  Background: User is on the login page
    Given user is on the login page


  Scenario: User can login with valid credentials
  When user enters valid credentials
  Then user should land on dashboard


  Scenario: User cannot login with any invalid credentials
    When user enters invalid "invalid" credentials
    Then error message "Kullanıcı adı ya da parola hatalı." should be displayed

    Scenario: User cannot login with any empty credentials
      When user enters "" credentials
      Then error message with validation message "Please fill out this field" should be displayed


  Scenario: User can see the password in form of dots by default
    When user enters the password
    Then user should see the password in form of dots by default

  Scenario: User can see the password explicitly if needed
    When user enters the password
    And user clicks on the eye icon
    Then user should see the password explicitly


  Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset password" button on the next page after clicking on forget password link
    When user clicks to forgot password link
    Then user should see reset password button

  Scenario: User can see valid placeholders on Username and Password fields
  Then user can see valid placeholders on Username and Password fields






#As a user, I should be able to login.
#
#Acceptance Criteria:
#
#1-User can login with valid credentials
#2-User cannot login with any invalid credentials
#-"Wrong username or password." should be displayed for invalid credentials
#-"Please fill out this field" message should be displayed if the password or username is empty
#3-User can see the password in form of dots by default
#4-User can see the password explicitly if needed
#5-User can see the "Forgot password?" link on the login page and can see the "Reset password" button on the next page after clicking on forget password link
#6-User can see valid placeholders on Username and Password fields