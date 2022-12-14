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

    @FindBy(linkText = "My Orders")
    public static WebElement MyOrdersLink;

    @FindBy(linkText = "What's New")
    public static WebElement WhatIsNewLink;

    @FindBy(linkText = "Bras & Tanks")
    public static WebElement BraRangeLink;

    @FindBy(linkText = "Electra Bra Top")
    public static WebElement BraTopLink;

    @FindBy(css = "#option-label-size-157-item-172")
    public static WebElement BraSizeLink;




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

    public void clickMyOrdersLink() {MyOrdersLink.click();}

    public void clickWhatIsNewLink() {WhatIsNewLink.click();}

    public void clickBraRangeLink() {BraRangeLink.click();}

    public void clickBraTopLink() {BraTopLink.click();}

    public void clickBraSizeLink() {BraSizeLink.click();}



    }

