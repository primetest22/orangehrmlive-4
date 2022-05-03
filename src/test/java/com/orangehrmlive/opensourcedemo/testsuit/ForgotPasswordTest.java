package com.orangehrmlive.opensourcedemo.testsuit;

import com.orangehrmlive.opensourcedemo.pages.ForgotPasswordPage;
import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    //object creation
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordText = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        //click on forgot password link
        loginPage.VerifyForgotPasswordLink();

        //validate display
        String expectedMessage = "Forgot Your Password?";
        String actualMessage = forgotPasswordText.verifyForgotPasswordText();

        Assert.assertEquals(actualMessage, expectedMessage, "Welcome text not displayed");


    }

}
