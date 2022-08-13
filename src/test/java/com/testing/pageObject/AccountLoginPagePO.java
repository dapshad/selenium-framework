package com.testing.pageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {

    @FindBy(id = "email")
    public static WebElement Email;

    @FindBy(id ="pass")
    public static WebElement Password2;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;

    public AccountLoginPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String NewEmail) {Email.sendKeys(NewEmail);}

    public void enterPassword2(String NewPassword) {Password2.sendKeys(NewPassword);}

    public void clickSignInButton() {SignInButton.click();}

    }



