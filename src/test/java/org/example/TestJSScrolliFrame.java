package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestJSScrolliFrame extends BrowserSetup{

        By frame = By.name("iframe-name");

        By support_email = By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']");

        By iframe_example_locator = By.xpath("//legend[normalize-space()='iFrame Example']");
        @Test
        public void testAction() throws InterruptedException {
                browser.get("https://rahulshettyacademy.com/AutomationPractice/");

                JavascriptExecutor js = (JavascriptExecutor)browser;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

                Thread.sleep(1000);

                js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");

                Thread.sleep(1000);

                WebElement iframe_example = getElement(iframe_example_locator);

                js.executeScript("arguments[0].scrollIntoView();", iframe_example);
                Thread.sleep(1000);

//                browser.switchTo().frame("courses-iframe");
//                browser.switchTo().frame("iframe-name");
//                browser.switchTo().frame(0);
                browser.switchTo().frame(getElement(frame));
                System.out.println(getElement(support_email).getText());
                Thread.sleep(2000);

//                browser.switchTo().parentFrame();
                browser.switchTo().defaultContent();


                iframe_example = getElement(iframe_example_locator);
                System.out.println(iframe_example.getText());

        }
}
