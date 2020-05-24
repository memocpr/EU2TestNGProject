package com.cybertek.tests.day11_fileUpload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpLoadTestX {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    /**
     *  go to website http://practice.cybertekschool.com/upload
     *  upload file.txt
     *  click upload
     *  verify file name is displayed in the next page
     */

    @Test

    public void test(){

        driver.get("http://practice.cybertekschool.com/upload");

        driver.findElement(By.cssSelector("#file-upload")).sendKeys("/Users/user/Desktop/textX.txt");

        driver.findElement(By.cssSelector("#file-submit")).click();

        String expectedText="textX.txt";

        String actualText=driver.findElement(By.cssSelector("#uploaded-files")).getText();

        Assert.assertEquals(actualText,expectedText,"verify text is textX.txt");

    }

    @Test

    public void test2(){

        driver.get("http://practice.cybertekschool.com/upload");

        WebElement chooseFile=driver.findElement(By.cssSelector("#file-upload"));

     //   String projectPath=System.getProperty("user.dir");

      //  String relativePath="src/test/resources/testfile.txt";

       // String filePath=projectPath+"/"+relativePath;

        //chooseFile.sendKeys(filePath);

        String absulatePath="/Users/user/Desktop/EU2TestNGProject/src/test/resources/testfile.txt";

        chooseFile.sendKeys(absulatePath);

        driver.findElement(By.cssSelector("#file-submit")).click();

        String expectedText="testfile.txt";

        String actualText=driver.findElement(By.cssSelector("#uploaded-files")).getText();

        Assert.assertEquals(actualText,expectedText,"verify text is testfile.txt");


    }




}
