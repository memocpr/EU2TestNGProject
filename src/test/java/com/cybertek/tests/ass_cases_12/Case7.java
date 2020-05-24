package com.cybertek.tests.ass_cases_12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case7 {

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
    public void test1(){

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("File Upload")).click();

        WebElement chooseFile=driver.findElement(By.cssSelector("#file-upload"));

        chooseFile.sendKeys("/Users/user/Desktop/textX.txt");

        driver.findElement(By.cssSelector("#file-submit")).click();

        String expected="File Uploaded!";

        String actual=driver.findElement(By.xpath("//div/h3")).getText();

        Assert.assertEquals(actual,expected,"verify that text is File Uploaded!");


        expected="textX.txt";

        actual= driver.findElement(By.cssSelector("#uploaded-files")).getText();

        Assert.assertEquals(actual,expected,"textX.txt");


    }
}
