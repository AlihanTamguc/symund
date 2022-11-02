@logout
Feature: Logout Symund

  Background:
    Given user is already on dashboard

    @SYMU-1694
  Scenario: User can log out and ends up in login page
    When user clicks on logout button
    Then user ends up in login page

  @SYMU-1695
    Scenario:User cannot go to home page again by clicking step back button after successfully logged out.
      Given user clicks on logout button
      When user clicks step back button
      Then user has no access back to homepage

