package com.cybertek.tests.day8_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDownX {

@Test

        public void test(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");

    WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));


    dropdownElement.click();

    List<WebElement> dropdownOptions=driver.findElements(By.className("dropdown-item"));


    for (WebElement option : dropdownOptions) {

        System.out.println(option.getText());

    }


    dropdownOptions.get(2).click();











}








}
