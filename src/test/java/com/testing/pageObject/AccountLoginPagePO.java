package com.testing.pageObject;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {

    @FindBy(id = "EmailOrAccountNumber")
    public static WebElement EmailField;

    @FindBy(id ="Password")
    public static WebElement PasswordField;

    @FindBy(css = "#SignInNow")
    public static WebElement SignInButton;

    @FindBy(css = "#block-collapsible-nav > ul > li:nth-child(7) > a")
    public static WebElement MyAccountSummary;

    @FindBy(id = "ui-id-4")
    public static WebElement Women;

    @FindBy(css = "body")
    public static WebElement Item;

    @FindBy(id = "option-label-color-93-item-52")
    public static WebElement ItemColour;

    @FindBy(id = "option-label-size-157-item-172")
    public static WebElement ItemSize;

    @FindBy(id = "product-addtocart-button")
    public static WebElement AddItemToCartButton;


    public AccountLoginPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String Email) {
        EmailField.sendKeys(Email);

    }

    public void enterPassword(String Password) {PasswordField.sendKeys(Password);}

    public void clickSignInButton() {SignInButton.click();}

    public void clickMyAccountSummary() {MyAccountSummary.click();}

    public void clickWomenLink() {Women.click();}

    public void clickWomenItem() {Item.click();}

    public void clickColour() {ItemColour.click();}

    public void clickSize() {ItemSize.click();}

    public void clickAddToCartButton() {AddItemToCartButton.click();}







    }



