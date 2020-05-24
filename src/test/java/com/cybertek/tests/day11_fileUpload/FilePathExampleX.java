package com.cybertek.tests.day11_fileUpload;

import org.testng.annotations.Test;

public class FilePathExampleX {


    @Test

            public void test(){

        //getting project location/path dynamicly

        String projectPath=System.getProperty("user.dir");

        String relativePath="src/test/resources/testfile.txt";


        String filePath=projectPath+"/"+relativePath;

        String absulatePath="/Users/user/Desktop/EU2TestNGProject/src/test/resources/testfile.txt";




        System.out.println("projectPath = " + projectPath);

        System.out.println("relativePath = " + relativePath);


        System.out.println("filePath = " + filePath);

        System.out.println("absulatePath = " + absulatePath);


    }




}
