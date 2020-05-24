package com.cybertek.tests.day14_properties_test;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTestX {

    @Test

    public void test1(){


        String browser = ConfigurationReader.get("browser");

        System.out.println("browser = " + browser);

       // WebDriver driver= WebDriverFactory.getDriver(browser);

        System.out.println("ConfigurationReader.get(\"driver_username\") = " + ConfigurationReader.get("driver_username"));


    }
}
