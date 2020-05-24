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

public class ActionTestX {

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

    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1=driver.findElement(By.tagName("img"));

        //Actions --> class that contains all the user interactions
        //how to create actions object / pasing driver as a constructor
        Actions action = new Actions(driver);

        //perform() --> perform the action, complete the action
        //moveToElement--> move your mouse to webelement(hover over)
        Thread.sleep(2000);
        action.moveToElement(img1).perform();

        WebElement link = driver.findElement(By.linkText("View profile"));

        Assert.assertTrue(link.isDisplayed(),"verify that View profile is displayed");

    }

    @Test
    public void dragAndDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        driver.manage().window().maximize();


        WebElement source=driver.findElement(By.cssSelector("#draggable"));
        WebElement target=driver.findElement(By.cssSelector("#droptarget"));

        Actions action = new Actions(driver);

        action.dragAndDrop(source,target).perform();

        Thread.sleep(3000);


    }

    @Test

    public void dragAndDropChaining() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        Actions action =new Actions(driver);

        WebElement source=driver.findElement(By.cssSelector("#draggable"));
        WebElement target=driver.findElement(By.cssSelector("#droptarget"));

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[.='Accept Cookies']")).click();

        Thread.sleep(1000);
        //drag and drop without draganddrop method

        //if you are chaining actions we add build() method before perform()
        action.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().build().perform();

    }
}
