package com.cybertek.tests.day7_types_of_elemants;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableElementsX {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("ttp://practice.cybertekschool.com/radio_buttons");

        WebElement buttonGreen = driver.findElement(By.id("green"));

        //how to check webelement is enabled or not ?

        System.out.println("buttonGreen.isEnabled() : "+buttonGreen.isEnabled());

        Assert.assertTrue(buttonGreen.isEnabled(),"verify green is enable");

        buttonGreen.click();

}

    @Test

    public void test2(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");



        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        inputBox.sendKeys("memo");
    }






}
