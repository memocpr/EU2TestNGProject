package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGAssertionsDemo {


    @Test

    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("title","tiTle");

        System.out.println("Second Assertion");

        Assert.assertEquals(1,1);

    }


    @Test

    public void test2(){

        System.out.println("second test case");
        Assert.assertEquals(2,2);

    }


    @Test

    public void test3(){

        String expectedTitle="Cyb";
        String actualTitle="Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"---Verify title---");
        Assert.assertTrue(1>1,"check your values---");

    }


    @Test
    public void test4(){

        String email = "mikesmith.com";

        //System.out.println(email.contains("@"));

        Assert.assertTrue(email.contains("@"),"verify email----");

    }


    @Test

    public void test5(){

        Assert.assertFalse(0>1,"verify the values-----");
    }


    @Test

    public void test6(){

        Assert.assertNotEquals("two","two","verify the values---");
    }




}
