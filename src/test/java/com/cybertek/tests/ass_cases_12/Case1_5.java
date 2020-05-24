package com.cybertek.tests.ass_cases_12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Case1_5 {

    WebDriver driver;

    @BeforeMethod

    public void beforeMethod(){

        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod

    public void afterMethod() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test

    public void test1(){

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        WebElement inputBox=driver.findElement(By.xpath("//input[@name='birthday']"));

        inputBox.sendKeys("wrong_dob");

        String expectedResult="The date of birth is not valid";

        String actualResult =driver.findElement(By.xpath("//small[.='The date of birth is not valid']")).getText();

        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(expectedResult,actualResult,"verify result is The date of birth is not valid");

    }


    @Test

    public void test2() {


        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        List<WebElement> buttons=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']"));


        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(),3);

        for (WebElement button : buttons) {

            System.out.println("button.isDisplayed() = " + button.isDisplayed());

            Assert.assertTrue(button.isDisplayed());

        }

    }

    @Test

    public void test3(){

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        WebElement nameInput=driver.findElement(By.xpath("//input[@*='firstname']"));

        nameInput.sendKeys("M");


        String actual=driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']")).getText();

        String expected="first name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actual,expected,"verify the message is equal first name must be more than 2 and less than 64 characters long");




    }

    @Test

    public void test4(){

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        WebElement lastNameInput=driver.findElement(By.xpath("//input[@*='lastname']"));

        lastNameInput.sendKeys("M");

        String actual=driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']")).getText();

        String expected="The last name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actual,expected,"verify the message is equal The last name must be more than 2 and less than 64 characters long");



    }

    @Test

    public void test5() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Registration Form')]")).click();

        WebElement nameInput=driver.findElement(By.xpath("//input[@*='firstname']"));

        nameInput.sendKeys("Mike");

        WebElement lastNameInput=driver.findElement(By.xpath("//input[@*='lastname']"));

        lastNameInput.sendKeys("Smith");

        WebElement userNameInput=driver.findElement(By.name("username"));

        userNameInput.sendKeys("mikesmith");

        WebElement email=driver.findElement(By.name("email"));

        email.sendKeys("mikesmith@gmail.com");

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("mike12345");

        driver.findElement(By.name("phone")).sendKeys("571-333-4444");

        driver.findElement(By.cssSelector("input[value='male']")).click();

        driver.findElement(By.name("birthday")).sendKeys("01/01/1999");

        WebElement departmentElement=driver.findElement(By.name("department"));

        Select departmantDropdown = new Select(departmentElement);

        departmantDropdown.selectByVisibleText("Department of Engineering");

        String expected="Department of Engineering";

        String actual=departmantDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected,"verify that the first select is Department of Engineering");

        WebElement jobElement=driver.findElement(By.name("job_title"));

        Select jobDropdown=new Select(jobElement);

        jobDropdown.selectByIndex(3);

        driver.findElement(By.xpath("//label[.='Java']")).click();

        Thread.sleep(3000);

        WebElement signInButton=driver.findElement(By.cssSelector("#wooden_spoon"));

        signInButton.click();

        expected="You've successfully completed registration!";

        //actual=

        Assert.assertEquals(actual,expected,"verify that the message is You've successfully completed registration!");










        
    }

}
