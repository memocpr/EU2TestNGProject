package com.cybertek.tests.day8_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        //save our webelements inside the list
        List<WebElement> buttons = driver.findElements(By.xpath("//button"));

        System.out.println("buttons.size() = " + buttons.size());

        //verify we have 6 button
        Assert.assertEquals(buttons.size(),6,"verify size of list");

        for (WebElement button : buttons) {

            System.out.println(button.getText());

            System.out.println("button.isDisplayed() = " + button.isDisplayed());

            Assert.assertTrue(button.isDisplayed());



            //get ony second button from the lst

            buttons.get(2).click();





        }



    }
    @Test
    public void test2() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        List<WebElement> buttons = driver.findElements(By.tagName("buttonasdagsdhjasgdha"));

        System.out.println("buttons.size() = " + buttons.size());

        WebElement button = driver.findElement(By.tagName("buttonasdagsdhjasgdha"));

    }


}
