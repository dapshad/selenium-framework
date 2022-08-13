package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    // Element locators to identify the Web elements: identification element class
    @FindBy(name = "firstname")
    public static WebElement FirstnameField;

    @FindBy(name= "lastname")
    public static WebElement LastnameField;

    @FindBy(name = "email")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button")
    public static WebElement CreateAnAccountButton;




    // Initialize web elements using Selenium webdriver
    public CreateAccountPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    // Page Specific Method : operational method class
    public void enterFirstname(String Firstname){
        FirstnameField.sendKeys(Firstname);
    }

    public void enterLastname(String Lastname){
        LastnameField.sendKeys(Lastname);
    }

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword){
        ConfirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void clickCreateAnAccountButton(){
        CreateAnAccountButton.click();
    }



    }

