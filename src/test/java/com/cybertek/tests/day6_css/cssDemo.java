package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick =  driver.findElement(By.cssSelector("button#disappearing_button"));

        driver.findElement(By.id("selenium"));

        System.out.println(dontClick.getText());

        driver.quit();
    }
}

