package com.askeledz.selenium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Created by Andrej on Jun 2017.
 */
public class InitialPageIOS implements InitialPage {

    public InitialPageIOS(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
    public MobileElement alertViews;

    public void openAlertViews() {
    	alertViews.click();
    }

}
