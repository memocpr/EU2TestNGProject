package com.cybertek.tests.EX;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheapAir {

    @Test

   public void dropdowns() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cheapoair.com/flights/book-now-pay-later-flights ");

        //Task 1 ----> find the frombutton and send fk
        WebElement fromButton = driver.findElement(By.id("ember532"));
        fromButton.clear();
        fromButton.sendKeys("fk");
        Thread.sleep(2000);
        // Task 2 ----> print the when type fk


        List<WebElement> airports = driver.findElements(By.className("suggestion-box__menu"));

        System.out.println(airports.size());

        for (WebElement airport : airports) {
            System.out.println(airport.getText());
        }



    }


    //











}













