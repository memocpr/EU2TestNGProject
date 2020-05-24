package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlNotChanged {

        public static void main(String[] args) {

            /**
             * open browser
             * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
             * click on Retrieve password
             * verify that url did not change
             */

            //open chrome browser
           WebDriver driver = WebDriverFactory.getDriver("chrome");

           //go to this site:
           driver.get("http://practice.cybertekschool.com/forgot_password");

           //save url before we click retrieve pasword button
            String ecpectedUrl = driver.getCurrentUrl();

           //click on retrieve
            // WebElement -->Interface that represent elements on the webpage
            //findElement-->method used to find element on a webpage
            WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));


            retrievePasswordButton.click();

            //verify that url did not change

            //save url before we click retrieve pasword button
            String actualUrl = driver.getCurrentUrl();


            if(actualUrl.equals(ecpectedUrl)){

                System.out.println("pass");
            }else{

                System.out.println("fail");
            }


            driver.quit();












        }






}
