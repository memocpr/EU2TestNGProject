package com.cybertek.tests.ass_cases_12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case9_12 {
    WebDriver driver;

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

    public void test9() throws InterruptedException {

        driver.navigate().to("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[.='Status Codes']")).click();
        driver.findElement(By.xpath("//a[.='200']")).click();

       WebElement message= driver.findElement(By.cssSelector("div>p"));

        Assert.assertTrue(message.isDisplayed(),"verify that message is displayed");

       Thread.sleep(3000);



        driver.navigate().back();

        driver.findElement(By.xpath("//a[.='301']")).click();


        WebElement message2= driver.findElement(By.cssSelector("div>p"));

        Assert.assertTrue(message2.isDisplayed(),"verify that message is displayed");

        Thread.sleep(3000);


        driver.navigate().back();

        driver.findElement(By.xpath("//a[.='404']")).click();


        WebElement message3= driver.findElement(By.cssSelector("div>p"));

        Assert.assertTrue(message3.isDisplayed(),"verify that message is displayed");

        Thread.sleep(3000);



        driver.navigate().back();

        driver.findElement(By.xpath("//a[.='500']")).click();


        WebElement message4= driver.findElement(By.cssSelector("div>p"));

        Assert.assertTrue(message4.isDisplayed(),"verify that message is displayed");

        Thread.sleep(3000);

    }
}
