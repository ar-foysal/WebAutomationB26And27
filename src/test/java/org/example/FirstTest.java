package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends BrowserSetup {

    @BeforeClass
    public void loadGooglePage(){
        // Load https://google.com
        browser.get("https://www.google.com/");
    }

    @Test
    public void testPageTitle(){
        // Test Page title should be 'Google'
        String page_title = browser.getTitle();
        Assert.assertEquals(page_title, "Google");
//        System.out.println(page_title);

    }

    @Test
    public void testPageURL(){
        // Test Page url should be 'https://google.com'
        Assert.assertEquals(browser.getCurrentUrl(), "https://www.google.com");
    }
}
