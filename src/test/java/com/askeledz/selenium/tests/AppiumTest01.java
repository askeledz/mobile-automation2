package com.askeledz.selenium.tests;

import com.askeledz.selenium.AppiumBase;
import com.askeledz.selenium.pages.AlertViewsPage;
import com.askeledz.selenium.pages.AlertViewsPageIOS;
import com.askeledz.selenium.pages.InitialPage;
import com.askeledz.selenium.pages.InitialPageIOS;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest01 extends AppiumBase {

    private static WebDriver driver = null;

    protected InitialPage initialPage;
    protected AlertViewsPage alertViewsPage;

    @Test
    public void SomeTest() throws Exception {

        driver = getDriver();

        initialPage = new InitialPageIOS(driver);
        alertViewsPage = new AlertViewsPageIOS(driver);

        //Search for contact
        initialPage.openAlertViews();

        //Verify page is open
        MobileElement getTitlePage = alertViewsPage.getTitlePage();
        //Assert.assertEquals("Alert Views", getTitlePage.getText());

        alertViewsPage.openTextEntryPage();
        alertViewsPage.entryText("F I L I P");
        alertViewsPage.clickOKButton();

        //Verify result
        MobileElement getTextFromButton = alertViewsPage.getSecureTextFromButton();
        Assert.assertEquals("Secure Text Entry", getTextFromButton.getText());
        //Thread.sleep(5000);
    }
}