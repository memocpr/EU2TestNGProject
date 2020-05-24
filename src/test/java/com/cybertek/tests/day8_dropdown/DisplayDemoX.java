package com.cybertek.tests.day8_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayDemoX {


    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput=driver.findElement(By.id("username"));

        Assert.assertFalse(usernameInput.isDisplayed(),"verify to the username is NOT displayed");

       // WebElement startButton=driver.findElement(By.id("start"));

        //startButton.click();

        driver.findElement(By.cssSelector("#start>button")).click();

        Thread.sleep(9000);


        Assert.assertTrue(usernameInput.isDisplayed(),"verify to the username is displayed");


        driver.quit();


    }


















}
