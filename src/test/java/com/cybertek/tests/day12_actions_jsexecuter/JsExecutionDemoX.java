package com.cybertek.tests.day12_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsExecutionDemoX {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void clickWithJS(){

        driver.get("http://practice.cybertekschool.com/");

        WebElement dropdown=driver.findElement(By.linkText("Dropdown"));

        //clicking with JavascriptExecutor
        //create js executor object
        JavascriptExecutor jse= (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].click();",dropdown);
    }

    @Test
    public void type() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox=driver.findElement(By.cssSelector("#input-example>input"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        String str = "hello inputbox";
        jse.executeScript("arguments[0].setAttribute('value', '"+str+"')",inputBox);

        Thread.sleep(2000);


    }

    @Test
    public void scrollDownAndUp() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;


        for (int i = 0; i < 10; i++) {

            Thread.sleep(2000);

            jse.executeScript("window.scrollBy(0, 250);");

        }

        for (int i = 0; i < 10; i++) {

            Thread.sleep(2000);

            jse.executeScript("window.scrollBy(0, -250);");

        }
    }
}
