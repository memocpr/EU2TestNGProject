package com.cybertek.tests.ass_cases_12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Case6 {

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

    public void test1() throws InterruptedException {

        driver.get("https://www.tempmailaddress.com/");

        WebElement emailElement=driver.findElement(By.cssSelector("#email"));

        String email=emailElement.getText();

        driver.navigate().back();

        driver.navigate().to("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("Sign Up For Mailing List")).click();

        driver.findElement(By.name("full_name")).sendKeys("mike");

        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("wooden_spoon")).click();

        String expected="Thank you for signing up. Click the button below to return to the home page.";

        String actual=driver.findElement(By.name("signup_message")).getText();

        Assert.assertEquals(actual,expected,"verify that the message is Thank you for signing up. Click the button below to return to the home page.");

        driver.navigate().back();

        driver.get("https://www.tempmailaddress.com/");

        driver.findElement(By.xpath("//tr[@class='//tr[@class='hidden-xs hidden-sm klikaciRadek']")).click();

        Thread.sleep(10000);

    }
}
