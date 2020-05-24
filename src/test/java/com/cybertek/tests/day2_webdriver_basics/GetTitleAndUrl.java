package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium
        //first shortcut to introduce local variable
        // alt+enter+enter
        //getTitle() ---> get you the title of page
        String title = driver.getTitle();

        System.out.println();

        // soutv + enter to print variable
        System.out.println("title = " + title);

        //gets the currentUrl
        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        //gets the pageSource
        String pageSource = driver.getPageSource();

        System.out.println("pageSource = " + pageSource);

    }
}
