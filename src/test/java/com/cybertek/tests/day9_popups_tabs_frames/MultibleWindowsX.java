package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultibleWindowsX {

    WebDriver driver;

    @BeforeMethod

    public void beforeMethod(){

        driver= WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod

    public void afterMethod() throws InterruptedException {

        Thread.sleep(3000);
    }

    @Test

    public void test() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("driver.getTitle() before new window = " + driver.getTitle());

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[.='Click Here']")).click();


        Thread.sleep(3000);

        System.out.println("driver.getTitle() after new window = " + driver.getTitle());

        String currentWindowHandled=driver.getWindowHandle();

        System.out.println("currentWindowHandled = " + currentWindowHandled);


        Set<String> windowsHandled=driver.getWindowHandles();

        for (String handle : windowsHandled) {

            if(!handle.equals(currentWindowHandled)){

                driver.switchTo().window(handle);

            }

            System.out.println("driver.getTitle() after handling = " + driver.getTitle());
        }

    }


    @Test

    public void moreThanOneWindoows(){

        driver.get("http://practice.cybertekschool.com/windows");

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowsHandled = driver.getWindowHandles();

        System.out.println("driver.getTitle() before switch = " + driver.getTitle());


        for (String handle : windowsHandled) {

            //one by one change it
            driver.switchTo().window(handle);

            if(handle.equals(windowsHandled)) {

                //stop on that window
                break;


            }
        }


        System.out.println("driver.getTitle() after switch = " + driver.getTitle());


    }
}
