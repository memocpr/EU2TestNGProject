package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframesX {

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

    public void test() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/iframe");


        //how to switch frames
        //1.Switch USING BY NAME OR ID attribute of iframe

        driver.switchTo().frame("mce_0_ifr");


        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("mike");

        //goes back to first frame(main html)
        //goes back to first frame, useful when we have switched multipe frames
        driver.switchTo().defaultContent();

        Thread.sleep(2000);


        //2.USING INDEX

        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("mike with index");

        driver.switchTo().defaultContent();
        Thread.sleep(2000);


        //3.USING WEBELEMENT
        //locating iframe with any valid locator

        WebElement iframeElement=driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframeElement);
        Thread.sleep(2000);

        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith WITH WEBELEMENT");

    }

    @Test

    public void test2(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
         driver.switchTo().frame("frame-top");

        //top has 3 children left, middle, right
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());
        
        //switch to parent --frame top

        driver.switchTo().parentFrame();

        driver.switchTo().frame(2);
        System.out.println(driver.findElement(By.tagName("body")).getText());


        //to switch main html we can use default content
        driver.switchTo().defaultContent();

        //switch to bottom
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());


    }


}
