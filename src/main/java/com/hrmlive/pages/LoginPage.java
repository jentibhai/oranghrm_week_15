package com.hrmlive.pages;

import com.hrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {



    @CacheLookup
    @FindBy (name="username")
    WebElement username;

    public void enteruserName(String Username){
        Reporter.log("enterUserName"+username.toString());
        sendTextToElement(username,Username);}

    @CacheLookup
    @FindBy (name="password")
    WebElement Password;
    public void enterPassword(String password){
        Reporter.log("enterpassword"+password.toString());
        sendTextToElement(Password,password);}
    @CacheLookup
    @FindBy (xpath="//button[@type='submit'] ")
    WebElement loginButton;
    public void clickLoginButton(){
        Reporter.log("clickLoginButton"+loginButton.toString());
        clickOnElement(loginButton);}

   @CacheLookup
   @FindBy (xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
   WebElement errorMessage;
    public String getErrorMessage(){
        Reporter.log("getErrrorMessage"+errorMessage.toString());
        return getTextFromElement(errorMessage);}


    @CacheLookup
    @FindBy (xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'] ")
    WebElement forgotPassword;
    public void clickOnForgotPassword(){
        Reporter.log("clickOnforgotpassword"+forgotPassword.toString());
        clickOnElement(forgotPassword);}

    @CacheLookup
    @FindBy (xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement errorMessage1;
    public String resetpassword(){
        Reporter.log("resetpassword"+errorMessage1.toString());
        return getTextFromElement(errorMessage1);}






}
