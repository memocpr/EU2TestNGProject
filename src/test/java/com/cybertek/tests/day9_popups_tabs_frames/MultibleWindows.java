package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultibleWindows {


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

  public void switchWindowsTest() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("driver.getTitle() before new window = " + driver.getTitle());

        Thread.sleep(2000);

        driver.findElement(By.linkText("Click Here")).click();


        Thread.sleep(2000);

        System.out.println("driver.getTitle() after new window= " + driver.getTitle());



        //driver.switchTo().window() //--->we need to :
        //System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());


        String currentWindowHandle=driver.getWindowHandle();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

        //we will switch to new window
        Set<String> windowsHandles = driver.getWindowHandles();

        System.out.println("windowsHandles.size() = " + windowsHandles.size());

        for (String handle : windowsHandles) {

            if(!handle.equals(currentWindowHandle)){

                driver.switchTo().window(handle);

            }

            System.out.println("driver.getTitle() after switching window= " + driver.getTitle());
        }

    }

    @Test

    public void moreThan2Window(){
        driver.get("http://practice.cybertekschool.com/windows");

        driver.findElement(By.linkText("Click Here")).click();

        //we will switch to new window
        Set<String> windowsHandles = driver.getWindowHandles();

        System.out.println("driver.getTitle() before switch = " + driver.getTitle());

        //loop through each window
        for (String handle : windowsHandles) {
            //one by one change it
            driver.switchTo().window(handle);

            if (driver.getTitle().equals("New Window")){

                //stop on that window
                break;
            }
        }

        System.out.println("driver.getTitle() after switch = " + driver.getTitle());


        System.out.println("driver.findElement(By.tagName(\"h3\")) = " + driver.findElement(By.tagName("h3")));
    }





}
