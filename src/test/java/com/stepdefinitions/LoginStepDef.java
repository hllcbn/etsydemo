package com.stepdefinitions;

import com.pages.mainpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginStepDef {

    WebDriver driver= DriverHelper.getDriver();
    mainpage mainPage=new mainpage(driver);


    @Given("User click signin button on the login page")
    public void user_click_signin_button_on_the_login_page() {
        mainPage.SignIn();
    }
    @When("User login into Etsy with {string} and {string}")
    public void user_login_into_etsy_with_and(String username, String password) {
        mainPage.SignInEtsy(ConfigReader.readProperty("username"),ConfigReader.readProperty("password"));
    }
    @Then("User verifies New User signUp is visible")
    public void user_verifies_new_user_sign_up_is_visible() {
        Assert.assertTrue(mainPage.validateHeader());
    }



}
