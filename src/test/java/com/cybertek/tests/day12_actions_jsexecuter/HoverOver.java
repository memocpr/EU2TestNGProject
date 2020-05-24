package com.cybertek.tests.day12_actions_jsexecuter;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverOver {
        WebDriver driver;

        @BeforeMethod
        public void setUpMethod(){
            driver = WebDriverFactory.getDriver("chrome");

        }

        @AfterMethod
        public void afterMethod() throws InterruptedException {
            Thread.sleep(4000);
            driver.quit();
        }

        /**
         * hover over each image in the website
         * verify each name:user text is displayed
         */


        @Test

        public void hoverOver() throws InterruptedException {

            driver.get("http://practice.cybertekschool.com/");

            driver.findElement(By.linkText("Hovers")).click();

            List<WebElement> hovers=driver.findElements(By.className("figure"));

            Actions action = new Actions(driver);

            WebElement user1=driver.findElement(By.xpath("//h5[.='name: user1']"));
            WebElement user2=driver.findElement(By.xpath("//h5[.='name: user2']"));
            WebElement user3=driver.findElement(By.xpath("//h5[.='name: user3']"));

            WebElement[] users={user1, user2, user3};

            for (int i = 0; i < 3; i++) {

                action.moveToElement(hovers.get(i)).perform();

                Assert.assertTrue(users[i].isDisplayed(),"verify that user is displayed");

            }

        }

    @Test
    public void oneImage(){
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);

        actions.moveToElement(img).perform();

        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text.isDisplayed(),"Verify user1 is displayed");

    }



    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */
    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");


        for (int i = 1; i <= 3; i++) {

            //creating dynamic xpath for images
            String imgXpath = "(//img)[" + i + "]";
            System.out.println(imgXpath);
            WebElement img = driver.findElement(By.xpath(imgXpath));

            Actions actions = new Actions(driver);

            actions.moveToElement(img).perform();

            String textXpath = "//h5[.='name: user" + i + "']";
            System.out.println(textXpath);
            WebElement text = driver.findElement(By.xpath(textXpath));

            Assert.assertTrue(text.isDisplayed(), "Verify user" + i + " is displayed");

        }
    }


    }


