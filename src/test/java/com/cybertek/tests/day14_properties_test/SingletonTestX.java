package com.cybertek.tests.day14_properties_test;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTestX {


    @Test

    public void test(){

        //SingletonX s1= new SingletonX();

        String s1=SingletonX.getinstance();
        String s2=SingletonX.getinstance();


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2); //if next value just repeat previous one -->like : s1=s2
    }


    @Test
    public void test1() throws InterruptedException {

       // WebDriver driver= WebDriverFactory.getDriver("chrome");
        //WebDriver driver= Driver.get();
        //driver.get("https://www.google.com/");
        // driver.quit();

        Driver.get().get("https://www.google.com/");

        Thread.sleep(2000);




    }

    @Test
    public void test2(){

       // WebDriver driver= Driver.get();
        //driver.get("https://www.amazon.com/");
        //driver.quit();

        Driver.get().get("https://www.amazon.com/");





    }
}
