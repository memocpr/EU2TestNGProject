package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        //setting up what browser we want for automation
        WebDriverManager.chromedriver().setup();

        //writing driver object for google
        WebDriver driver=new ChromeDriver();

        //navigating the google
        driver.get("https:/www.google.com");

        //navigate to another website with different selenium method
        driver.navigate().to("https:/www.facebook.com");

        //wait 3 second here then go back
        Thread.sleep(3000);

        //goes back to previous page
        driver.navigate().back();

        Thread.sleep(3000);

        //goes forward after back
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

    }
}
