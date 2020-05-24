package com.cybertek.tests.ass_cases_12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case8 {

    WebDriver driver;

    @BeforeMethod

    public void beforeMethod() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod

    public void afterMethod() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() {

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("Autocomplete")).click();

        driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");

        driver.findElement(By.xpath("//input[@onclick]")).click();

        String expexted = "You selected: United States of America";

        String actual = driver.findElement(By.cssSelector("#result")).getText();

        Assert.assertEquals(actual, expexted);

    }
}
