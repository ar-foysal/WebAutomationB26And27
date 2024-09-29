package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorBasic extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://www.google.com/");
        WebElement search_button;
        search_button = browser.findElement(By.id("APjFqb"));
        search_button = browser.findElement(By.name("q"));
        search_button = browser.findElement(By.className("gLFyf"));
        search_button = browser.findElement(By.tagName("textarea"));
        search_button.sendKeys("Hello");
        WebElement country = browser.findElement(By.cssSelector("div[class='uU7dJb']"));
        System.out.println(country.getText());
        WebElement text_el = browser.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(text_el.getText());

        WebElement how_works = browser.findElement(By.linkText("সার্চ কীভাবে কাজ করে"));
        how_works = browser.findElement(By.partialLinkText("সার্চ কীভাবে"));
        how_works.click();
        Thread.sleep(5000);

    }
}
