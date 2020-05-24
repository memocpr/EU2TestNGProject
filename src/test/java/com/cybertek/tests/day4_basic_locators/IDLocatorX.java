package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorX {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontclickbutton = driver.findElement(By.id("disappearing_button"));

        Thread.sleep(3000);

        dontclickbutton.click();

        WebElement message = driver.findElement(By.id("result"));

        System.out.println("message.getText() = " + message.getText());


    }
}
