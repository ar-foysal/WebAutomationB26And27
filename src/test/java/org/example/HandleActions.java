package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleActions extends BrowserSetup{

        By mouseHoverButton = By.xpath("//button[@id='mousehover']");
        By topOption = By.xpath("//a[normalize-space()='Top']");
        By reloadOption = By.xpath("//a[normalize-space()='Reload']']");

        By autoComplete = By.xpath("//input[@id='autocomplete']");

        By name = By.xpath("//input[@id='name']");
        @Test
        public void testAction() throws InterruptedException {
                browser.get("https://rahulshettyacademy.com/AutomationPractice/");

                Actions actions = new Actions(browser);
                actions.scrollByAmount(0, 1000).build().perform();

                actions.moveToElement(getElement(mouseHoverButton)).build().perform();
                actions.click(getElement(topOption)).build().perform();
                Thread.sleep(2000);

                actions.sendKeys( getElement(autoComplete),"Bangladesh").build().perform();
                Thread.sleep(2000);

                actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
                Thread.sleep(2000);
                actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
                Thread.sleep(2000);
                actions.click(getElement(name)).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
                Thread.sleep(5000);


        }
}
