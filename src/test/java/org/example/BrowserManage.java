package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserManage extends BrowserSetup{

    @Test
    public void testBrowser() throws InterruptedException {
        browser.get("http://www.google.com");
        Thread.sleep(2000);

        browser.navigate().to("http://www.facebook.com");

        Thread.sleep(2000);

        browser.navigate().back();
        Thread.sleep(2000);

        browser.navigate().forward();

        Thread.sleep(2000);

        browser.navigate().refresh();

        Thread.sleep(2000);

        browser.manage().window().minimize();

        Thread.sleep(2000);

        browser.manage().window().maximize();

        Thread.sleep(2000);

        browser.manage().window().fullscreen();

        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.TAB);
        browser.get("http://www.google.com");
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.WINDOW);
        browser.navigate().to("http://www.facebook.com");
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
        Thread.sleep(2000);

        browser.close();

    }

    @Test
    public void testDifferentWindow() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        getElement(By.xpath("//a[@id='opentab']")).click();

        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());

        Thread.sleep(10000);

        System.out.println(browser.getWindowHandle());

        List<String> handles = new ArrayList<>( browser.getWindowHandles());

        for (String handle: handles){
            System.out.println(handle);
        }

        browser.switchTo().window(handles.get(1));
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
        System.out.println(getElement(By.cssSelector("div[class='support float-left'] span")).getText());
        browser.switchTo().window(handles.get(0));
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
    }

}
