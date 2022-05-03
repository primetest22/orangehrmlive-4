package com.orangehrmlive.opensourcedemo.pages;


import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By welcomeText = By.xpath("//a[@id='welcome']");
    By forgotPasswordLink = By.linkText("Forgot your password?");


    public void VerifyForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);

    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterUserName(String username) {
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }




}
