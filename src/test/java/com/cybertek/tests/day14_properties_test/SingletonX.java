package com.cybertek.tests.day14_properties_test;

public class SingletonX {

    private SingletonX(){}

    private static String str="str is NOT null";

    public static String getinstance(){

        //if str has no value, initialize it and return it
        if(str==null){

            System.out.println("str is null, assign any value");

            str="some value";
        }else{

            System.out.println("str has some value, just return it");

        }

        return str;

    }








}
