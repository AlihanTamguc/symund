package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
      public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public  WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"lost-password\"]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[@id=\"body-login\"]/div[1]/div/main/div/div/form/fieldset/p[2]/a")
    public WebElement showPassword;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUserNamePassowrdWarning;

    @FindBy(xpath = "//*[@id=\"reset-password-submit\"]")
    public WebElement resetPassword;



}










