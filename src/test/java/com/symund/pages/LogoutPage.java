package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){

        PageFactory.initElements(Driver.getDriver(),this);



    }


    @FindBy(xpath = "//*[@id=\"expand\"]/div[1]")
    public WebElement img;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]")
    public WebElement logoutButton;









}
