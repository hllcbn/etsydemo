package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {

    public mainpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[contains(@class,'signin-header-action select-signin')]")
    WebElement signinlogin;

    @FindBy(id = "join_neu_email_field")
    WebElement email;

    @FindBy(id = "join_neu_password_field")
    WebElement password;

    @FindBy(xpath = "//h1[contains(@class,'welcome-message-text')]")
    WebElement header;

    @FindBy(xpath = "//button[@name='submit_attempt']")
    WebElement signInButton;


//    @FindBy(css = "#global-enhancements-search-query")
//    WebElement searchBox;


    public void SignIn(){signinlogin.click();}


    public void SignInEtsy(String username,String password){

        email.sendKeys(username);
        this.password.sendKeys(password);
        signInButton.click();

    }

    public boolean validateHeader(){
        return header.isDisplayed();
    }


//    public void search(String word){
//        searchBox.sendKeys(word, Keys.ENTER);
//    }




}

