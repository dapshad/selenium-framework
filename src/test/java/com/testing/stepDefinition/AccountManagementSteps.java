package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.AccountLoginPagePO;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccount();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String Firstname, String Lastname, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(Firstname);
        createAccountPagePO.enterLastname(Lastname);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);

    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAnAccountButton();

    }

    @Then("My account page should be displayed")
    public void myAccountPageShouldBeDisplayed() {
    }
    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
        HomePagePO homepagePO = new HomePagePO(driver);
        homepagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        AccountLoginPagePO accountLoginPagePO =  new AccountLoginPagePO(driver);
        accountLoginPagePO.enterEmail(Email);
        accountLoginPagePO.enterPassword(Password);
    }

    @And("I click on SignIn")
    public void iClickOnSignInButton() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickSignInButton();
    }

    @Then("My account page should be opened")
    public void myAccountPageShouldBeOpened() {
        String expectedPageTitle = "Customer Login";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
}
