package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {

    WebDriver driver; //to make the variable(driver) global and can be use in the all other methhods, we put it outside the methods

    @BeforeMethod

    public void beforeMethod(){

        driver= WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod

    public void afterMethod() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test

    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

        Thread.sleep(5000); //come from JAVA, not selenium-->static wait. It is important where we locate Thread

        driver.findElement(By.id("username")).sendKeys("mike smith");


        //important point is locator is part of HTML(even if it is NOT visible on screen) while page loading




    }
}
