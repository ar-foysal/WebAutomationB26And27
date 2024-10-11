package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DiffTypeWait extends BrowserSetup{

    By click_me = By.xpath("//input[@name='commit']");
    By h2_text = By.xpath("//h2[@id='two']");
    By loader_delay_text = By.xpath("//h2[@id='loaderdelay']");
    By start = By.xpath("//input[@id='loaderStart']");

    By loading = By.xpath("//b[normalize-space()='Loading...']");
    @Test
    public void testWait() throws InterruptedException {
        browser.get("https://qavbox.github.io/demo/delay/");

        getElement(click_me).click();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(h2_text,"I am here!" ));
//        Thread.sleep(10000);
        Assert.assertEquals(getElement(h2_text).getText(), "I am here!");
        getElement(start).click();

//        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loader_delay_text));
        Assert.assertEquals(getElement(loader_delay_text).getText(), "I appeared after 5 sec loading");
    }
}
