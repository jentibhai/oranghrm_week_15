package com.hrmlive.testsuite;

import com.hrmlive.pages.LoginPage;
import com.hrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){loginPage =new LoginPage();}

    @Test(groups = {"sanity","regression"})

    public void userSholdLoginSuccessfullyWithValidCredentials(){

        loginPage.enteruserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        String expextedText ="Dashboard";
        String actualText =loginPage.getErrorMessage();
        Assert.assertEquals(actualText,expextedText,"Dashboard message not shown");
    }

    @Test(groups = {"smoke","regression"})

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        loginPage.clickOnForgotPassword();
        String expectedText ="Reset Password";
        String actualText =loginPage.resetpassword();
       // Assert.assertEquals(actualText,expectedText,"Reset Password not showing");
        Assert.assertEquals(1,2);

    }







}
