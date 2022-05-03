package com.orangehrmlive.opensourcedemo.testsuit;

import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
     //object creation
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        
        //enter valid values
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        //validate message
        String expectedMessage = "Welcome";
        String actualMessage = loginPage.getWelcomeText().substring(0, 7);

        Assert.assertEquals(expectedMessage, actualMessage, "Welcome text not displayed");


    }


}



