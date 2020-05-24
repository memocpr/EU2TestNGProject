package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class callWebDriver {

    public static void main(String[] args) {

        //call the web driver from web driver factory:
        WebDriver driver= WebDriverFactory.getDriver("firefox");

        driver.get("http://practice.cybertekschool.com/open_new_tab");


    }
}
