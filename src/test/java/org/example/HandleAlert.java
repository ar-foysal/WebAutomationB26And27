package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends BrowserSetup{

        By jsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
        By jsConfirm = By.xpath("//button[@onclick='jsConfirm()']");
        By jsPrompt = By.xpath("//button[@onclick='jsPrompt()']");
        By  result = By.xpath("//p[@id='result']");
        @Test
        public void testAlert() throws InterruptedException {
                browser.get("https://the-internet.herokuapp.com/javascript_alerts");
                getElement(jsAlertButton).click();
                Alert alert = browser.switchTo().alert();
                System.out.println(alert.getText());
                alert.accept();
                Assert.assertEquals(getElement(result).getText(), "You successfully clicked an alert");
                Thread.sleep(2000);

                getElement(jsConfirm).click();
                alert = browser.switchTo().alert();
                System.out.println(alert.getText());
                alert.dismiss();
                Assert.assertEquals(getElement(result).getText(), "You clicked: Cancel");

                getElement(jsPrompt).click();
                alert = browser.switchTo().alert();
                System.out.println(alert.getText());
                alert.sendKeys("Hello");
                alert.accept();
                Assert.assertEquals(getElement(result).getText(), "You entered: Hello");
                Thread.sleep(2000);
        }
}
