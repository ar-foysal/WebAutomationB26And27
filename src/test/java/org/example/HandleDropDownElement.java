package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropDownElement extends BrowserSetup {


    By dropdown_button = By.xpath("//select[@id='dropdown-class-example']");

    @Test
    public void testDropdown() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = getElement(dropdown_button);
        dropdown.click();

        Select select = new Select(dropdown);

        select.selectByValue("option2");

        Thread.sleep(2000);

        select.selectByVisibleText("Option1");
        Thread.sleep(2000);

        select.selectByIndex(3);
        Thread.sleep(2000);

        List<WebElement> options = select.getOptions();

        for (WebElement option: options){
            System.out.println(option.getText());
        }

        System.out.println( select.getFirstSelectedOption().getText());

    }
}
