package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExampleX {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

        // we can put it here before findelement
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        //Thread.sleep(2000);
        driver.quit();
    }

    @Test

    public void test1(){


        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        System.out.println("driver.findElement(By.id(\"finish\")).getText() = " + driver.findElement(By.id("finish")).getText());


    }
}
