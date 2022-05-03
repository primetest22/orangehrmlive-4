package com.orangehrmlive.opensourcedemo.testbase;
import com.orangehrmlive.opensourcedemo.propertyreader.PropertyReader;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);

    }

    @AfterMethod
    public void teardown() {

        closeBrowser();

    }


}
