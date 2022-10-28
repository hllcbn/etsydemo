package com.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.DriverHelper;

import java.util.List;


public class searchpage {

    public searchpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#global-enhancements-search-query")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id='sortby']")
    WebElement sortby;

    @FindBy(linkText = "Lowest Price")
    WebElement lowestprice;

    @FindBy(className = "currency-value")
    List<WebElement> allprices;


    public void search(String word){
        searchBox.sendKeys(word, Keys.ENTER);
    }

    public void sortitem(){


        sortby.click();
        BrowserUtils.scrollWithAmount(DriverHelper.getDriver());
        lowestprice.click();

    }

    public void topTenLowerPrice(){
    System.out.println("-------TOP 10 LOWER PRICE FOR ");

       for(int i = 0;i<allprices.size();i++){
           System.out.println(allprices.get(i).getText());
       }

    }



}
