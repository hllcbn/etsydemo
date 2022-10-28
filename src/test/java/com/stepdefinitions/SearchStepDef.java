package com.stepdefinitions;

import com.pages.mainpage;
import com.pages.searchpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class SearchStepDef {
    WebDriver driver= DriverHelper.getDriver();

    searchpage searchpage = new searchpage(driver);

    @When("User searches for {string}")
    public void user_searches_for(String search) {
        searchpage.search(search);
    }


    @Then("User validates the title is {string}")

    public void user_validates_the_title_is(String title) {
        Assert.assertEquals(title,driver.getTitle().trim());
    }

    @Then("Sort them as lower price")
    public void sort_them_as_lower_price() {
       searchpage.sortitem();
       searchpage.topTenLowerPrice();

    }



}
