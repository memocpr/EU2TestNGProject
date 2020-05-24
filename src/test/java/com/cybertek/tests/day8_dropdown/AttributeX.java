package com.cybertek.tests.day8_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeX {


    @Test

    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");



        WebElement radioButton = driver.findElement(By.id("blue"));


        //get the value of type attribute

        System.out.println("radioButton.getAttribute(\"name\") = " + radioButton.getAttribute("name"));

        System.out.println("radioButton.getAttribute(\"type\") = " + radioButton.getAttribute("type"));

        //get the value of checked
        //since cheched attribute does not keep any value it ll return true or false based on the condition


        System.out.println("radioButton.getAttribute(\"checked\") = " + radioButton.getAttribute("checked"));

        System.out.println("radioButton.getAttribute(\"href\") = " + radioButton.getAttribute("href"));

        System.out.println("radioButton.getAttribute(\"outerHTML\") = " + radioButton.getAttribute("outerHTML"));


        driver.quit();


    }












}
