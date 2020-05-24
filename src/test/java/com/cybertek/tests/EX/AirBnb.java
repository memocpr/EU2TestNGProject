package com.cybertek.tests.EX;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class AirBnb {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test

    public void test1() throws InterruptedException {

        driver.get("https://www.airbnb.com/");


        WebElement research = driver.findElement(By.xpath("//div[.='Location']"));

        Actions actions=new Actions(driver);

        actions.click(research).sendKeys("new z").perform();

        actions.click(driver.findElement(By.xpath("//div[.='New Zealand']//div"))).perform();











        Thread.sleep(6000);


    }
}
