package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorAdv extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://www.google.com");
//        browser.findElement(By.cssSelector("textarea")).sendKeys("CSS Selector");
        browser.findElement(By.xpath("//textarea")).sendKeys("XPATH");
        String text = browser.findElement(By.cssSelector("div[class=\"KxwPGc AghGtd\"] > a")).getText();

        System.out.println("css selector: " + text);

        text = browser.findElement(By.xpath("//div[@class=\"KxwPGc AghGtd\"] /a")).getText();
        System.out.println("xpath: " + text);

        List<WebElement> links = browser.findElements(By.xpath("//div[@class=\"KxwPGc AghGtd\"] /a"));

        for (WebElement link: links){
            System.out.println(link.getText());
        }
        Thread.sleep(3000);
    }
}
