package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InteractWithElement extends BrowserSetup{

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement radio_button1 = getElement(By.cssSelector("input[value='radio1']"));
        Assert.assertTrue(radio_button1.isEnabled());

        Assert.assertFalse(radio_button1.isSelected());
        radio_button1.click();
        WebElement radio_button2 = getElement(By.cssSelector("input[value='radio2']"));
        Assert.assertTrue(radio_button1.isSelected());
        Assert.assertFalse(radio_button2.isSelected());

        WebElement displayed_box = getElement(By.xpath("//input[@id='displayed-text']"));
        Assert.assertTrue(displayed_box.isDisplayed());

        getElement(By.xpath("//input[@id='hide-textbox']")).click();
        Assert.assertFalse(displayed_box.isDisplayed());

        WebElement dropdown_title = getElement(By.xpath("//legend[normalize-space()='Dropdown Example']"));
        Assert.assertEquals(dropdown_title.getText(), "Dropdown Example");

        WebElement name = getElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Bangladesh");

        Assert.assertEquals(name.getAttribute("value"), "Bangladesh");
        Thread.sleep(3000);
        String placeholder =  name.getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Enter Your Name");

        String css_background  =  name.getCssValue("background-color");
        Assert.assertEquals(css_background, "rgba(255, 255, 255, 1)");

        name.clear();
        Assert.assertEquals(name.getAttribute("value"), "");
        Thread.sleep(3000);
    }
}
