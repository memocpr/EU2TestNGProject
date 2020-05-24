package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

    public static void main(String[] args) {

        /**
         *open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

    //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //navigate to url
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys() -->
        emailInputBox.sendKeys("test@gmail.com");

        WebElement retrievePasswordBtn=driver.findElement(By.id("form_submit"));

        retrievePasswordBtn.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){

            System.out.println("pass");
        }else{

            System.out.println("fail");
        }









    }
}

