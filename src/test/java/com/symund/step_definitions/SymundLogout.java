package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.pages.LogoutPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SymundLogout {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    @Given("user is already on dashboard")
    public void user_is_already_on_dashboard() {
        Driver.getDriver().get("https://qa.symund.com/");
        loginPage.username.sendKeys("Employee71");
        loginPage.password.sendKeys("Employee123");
        loginPage.loginButton.click();

    }


    @When("user clicks on logout button")
    public void userClicksOnLogoutButton() {
        logoutPage.img.click();
        logoutPage.logoutButton.click();
    }

    @Then("user ends up in login page")
    public void userEndsUpInLoginPage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Symund - QA"));
    }

    @When("user clicks step back button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user has no access back to homepage")
    public void userHasNoAccessBackToHomepage() {
       Assert.assertFalse(Driver.getDriver().getTitle().contains("Dashboard"));
    }
}
