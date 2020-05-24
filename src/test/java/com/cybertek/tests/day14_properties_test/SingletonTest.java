package com.cybertek.tests.day14_properties_test;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test(){

       // Singleton s1 = new Singleton(); // -->eror : private constructor: can Not create object


        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();


        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }


    @Test
    public void test1() throws InterruptedException {

        //WebDriver driver= WebDriverFactory.getDriver("chrome");
        //driver.get("https://www.google.com/");
            //instead of WebDriverFactory we use Driver Class:
        //WebDriver driver= Driver.get();


        //first get() = driver -->come from java
        //second get() -->come from selenium
        Driver.get().get("https://www.google.com/");

        Thread.sleep(2000);

    }

    @Test
    public void test2(){

        Driver.get().get("https://www.amazon.com/");


    }
}
