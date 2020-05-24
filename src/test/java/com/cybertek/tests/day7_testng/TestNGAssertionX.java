package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAssertionX {


    @Test

    public void test1(){

        System.out.println("this is first test");

        Assert.assertEquals("honda","honda","verify the values");

        Assert.assertTrue(1==1,"verify the values");

    }

    @Test

    public void test2(){

        System.out.println("this is second test");

        String expected = "mazda rx8";

        String actual = "mazda rx8";

        Assert.assertTrue(expected.equals(actual),"verify the values--------");

        Assert.assertTrue(expected.contains("rx8"),"verify the values--------");

    }


    @Ignore
    @Test

    public void test3(){

        System.out.println("this is third test");


    }



    @BeforeMethod

    public void setUp(){

        //Webdriver part

        System.out.println("BEFORE METHOD HERE");

        System.out.println("driver part");
    }


    @AfterMethod

    public void tearDown(){


        System.out.println("AFTER METHOD HERE");

        System.out.println("quit part");
    }


    @BeforeClass

    public void setUpClass(){

        System.out.println("--------before class------only once");
    }


    @AfterClass

    public void afterClass(){

        System.out.println("-----------after class---------only once");
    }


}
