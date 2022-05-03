package com.orangehrmlive.opensourcedemo.pages;

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By verifyText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public String verifyForgotPasswordText() {
        return getTextFromElement(verifyText);

    }




}
