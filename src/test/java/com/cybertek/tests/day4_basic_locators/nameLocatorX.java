package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorX {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement nameInputBox = driver.findElement(By.name("full_name"));

        nameInputBox.sendKeys("claire");

        WebElement emailInputBox = driver.findElement(By.name("email"));

        emailInputBox.sendKeys("claire3536373839.@gmail.com");

       // WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));

       // signUpButton.click();

        driver.findElement(By.name("wooden_spoon")).click();

        String ecpectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

      //  WebElement messageBox = driver.findElement(By.name("signup_message"));

       // String actualMessage = messageBox.getText();

        String actualMessage = driver.findElement(By.name("signup_message")).getText();

        if(actualMessage.equals(ecpectedMessage)){

            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }





    }


}
