package com.cybertek.tests.day7_types_of_elemants;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonX {

    @Test

    public void radioButton(){

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement buttonBlue= driver.findElement(By.id("blue"));

        WebElement buttonRed= driver.findElement(By.id("red"));

        //how to check radio button is selected ?
        System.out.println("buttonBlue.isSelected() : " + buttonBlue.isSelected());
        System.out.println("buttonRed.isSelected() : "+ buttonRed.isSelected());

        //verify blue is selected red is not selected
        Assert.assertTrue(buttonBlue.isSelected(),"verify button is selected");
        Assert.assertFalse(buttonRed.isSelected(),"verify button is NOT selected");

        //how to select radio button ?
        //we use click method to select radio buttons
        buttonRed.click();

        //verify blue is not selected red is selected
        Assert.assertTrue(buttonRed.isSelected(),"verify re button is selected");
        Assert.assertFalse(buttonBlue.isSelected(),"verify blue is NOT selected");

        driver.quit();
    }
}
