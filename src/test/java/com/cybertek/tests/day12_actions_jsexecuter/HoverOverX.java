package com.cybertek.tests.day12_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverOverX {

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

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */


    @Test

    public void test1(){

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img = driver.findElement(By.tagName("img"));

        Actions action = new Actions(driver);

        action.moveToElement(img).perform();

        WebElement name = driver.findElement(By.xpath("(//h5)[1]"));

        Assert.assertTrue(name.isDisplayed(),"verify that name is displayed");

    }

    @Test

    public void test2(){

        driver.get("http://practice.cybertekschool.com/hovers");


        Actions action = new Actions(driver);

        for (int i = 1; i <=3; i++) {

            String imgsXpath="(//img)["+i+"]";

            WebElement img=driver.findElement(By.xpath(imgsXpath));

            action.moveToElement(img).perform();

            String nameXpath="(//h5)["+i+"]";

            WebElement name=driver.findElement(By.xpath(nameXpath));

            Assert.assertTrue(name.isDisplayed(),"verify that name is displayed");

            System.out.println("name.getText() = " + name.getText());

        }
    }
}
