package com.cybertek.tests.day8_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElementsX {

    @Test

    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(),6,"verify size is 6");

        for (WebElement button : buttons) {

            System.out.println(button.getText());

            System.out.println("button.isDisplayed() = " + button.isDisplayed());

            buttons.get(5).click();

        }

    }

    @Test

    public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons= (List<WebElement>) driver.findElement(By.tagName("buttonxyz"));



        System.out.println("buttons.size() = " + buttons.size());




    }

}
