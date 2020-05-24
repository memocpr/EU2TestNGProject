package com.cybertek.tests.day16_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {



    @Test
    public void loginAsDriver(){

        LoginPage loginPage=new LoginPage();
        String url=ConfigurationReader.get("url");

        loginPage.loginAsDriver();

        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage=new LoginPage();

        String username= ConfigurationReader.get("salesmanager_username");

        String password =ConfigurationReader.get("salesmanager_password");

        loginPage.login(username,password); //call the method from LoginPage Class

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/","verify we successfuly login");


    }
}
