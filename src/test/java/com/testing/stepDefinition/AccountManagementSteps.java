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

    @And("I click on my order")
    public void iClickOnMyOrder() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickMyOrdersLink();
    }

    @And("I click on what's new")
    public void iClickOnWhatSNew() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickWhatIsNewLink();
    }

    @And("I click on bra range")
    public void iClickOnBraRange() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickBraRangeLink();
    }
    @And("I click on Bra")
    public void iClickOnBra() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickBraTopLink();
    }
    @And("I click on size")
    public void iClickOnSize() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickBraSizeLink();
    }

    @Then("My account page should be displayed")
    public void myAccountPageShouldBeDisplayed() {
    }

    //Login Scenario
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


    @And("I click on my account summary")
    public void iClickOnMyAccountSummary() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickMyAccountSummary();
    }

    @Then("My account page should be opened")
    public void myAccountPageShouldBeOpened() {
        String expectedPageTitle = "Account Summary | My Account |  Next Directory Online";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }

    @And("I click on Women")
    public void iClickOnWomen() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickWomenLink();
    }

    @And("I click on Item")
    public void iClickOnItem() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickWomenItem();
    }

    @And("I click on Colour")
    public void iClickOnColour() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickColour();
    }

    //@And("I click on Size")
    //public void iClickOnSize() {
        //AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        //accountLoginPagePO.clickSize();
    //}

    @And("I click on Add To Cart")
    public void iClickOnAddToCart() {
        AccountLoginPagePO accountLoginPagePO = new AccountLoginPagePO(driver);
        accountLoginPagePO.clickAddToCartButton();
    }

    @Then("My checkout page should be displayed")
    public void myCheckoutPageShouldBeDisplayed() {
    }



}
