package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SymundLogin {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.symund.com/");

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.username.sendKeys("Employee71");
        loginPage.password.sendKeys("Employee123");

    }
    @Then("user should land on dashboard")
    public void user_can_login_with_valid_credentials() {
        loginPage.loginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));

    }


    @Then("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String wrongusernamepassword) {
loginPage.wrongUserNamePassowrdWarning.isDisplayed();

    }

    @When("user enters {string} credentials")
    public void userEntersCredentials(String emptycred) {
        loginPage.username.sendKeys(emptycred);
        loginPage.password.sendKeys(emptycred);
      loginPage.loginButton.click();
    }

    @When("user enters the password")
    public void userEntersThePassword() {
        loginPage.password.sendKeys("Employee123");
    }

    @Then("user should see the password in form of dots by default")
    public void userShouldSeeThePasswordInFormOfDotsByDefault() {
        Assert.assertEquals("password", loginPage.password.getAttribute("type"));

    }

    @And("user clicks on the eye icon")
    public void userClicksOnTheEyeIcon() {
        loginPage.showPassword.click();
    }

    @Then("user should see the password explicitly")
    public void userShouldSeeThePasswordExplicitly() {
        Assert.assertEquals("text", loginPage.password.getAttribute("type"));

    }

    @When("user clicks to forgot password link")
    public void userClicksToForgotPasswordLink() {
        loginPage.forgotPassword.click();
    }

    @Then("user should see reset password button")
    public void userShouldSeeResetPasswordButton() {
        loginPage.resetPassword.isDisplayed();
    }

    @Then("user can see valid placeholders on Username and Password fields")
    public void userCanSeeValidPlaceholdersOnUsernameAndPasswordFields() {
        Assert.assertEquals("Kullanıcı adı ya da e-posta", loginPage.username.getAttribute("placeholder"));
        Assert.assertEquals("Parola", loginPage.password.getAttribute("placeholder"));

    }

    @When("user enters invalid {string} credentials")
    public void userEntersInvalidCredentials(String invalidcred) {
        loginPage.username.sendKeys(invalidcred);
        loginPage.password.sendKeys(invalidcred);
        loginPage.loginButton.click();

    }

    @Then("error message with validation message {string} should be displayed")
    public void errorMessageWithValidationMessageShouldBeDisplayed(String arg0) {
        String validationMessage = loginPage.username.getAttribute("validationMessage");
        System.out.println(validationMessage);
        Assert.assertEquals("Lütfen bu alanı doldurun.", validationMessage);

    }
}
