package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    WebDriver browser;

    @BeforeSuite
    public WebDriver openABrowser(){
        browser = new ChromeDriver();
        return browser;
    }

    @AfterSuite
    public void closeBrowser(){
        browser.close();
    }
}
