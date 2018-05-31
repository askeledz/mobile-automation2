package com.askeledz.selenium.tests;

import com.askeledz.selenium.AppiumBase;
import com.askeledz.selenium.pages.AlertViewsPage;
import com.askeledz.selenium.pages.InitialPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AppiumTest02 extends AppiumBase {

    private static WebDriver driver = null;

    protected InitialPage initialPage;
    protected AlertViewsPage alertViewsPage;

    @Test
    public void SomeTest() throws Exception {

        driver = getDriver();
        Thread.sleep(6000);
    }
}