package com.cybertek.tests.ass_vytruck;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VytruckCalenderEvents extends TestBase {


    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();
    CalendarEventsPage calendarEventsPage=new CalendarEventsPage();

    public void goToCalenderEvent(){

        loginPage.loginAsStoreManager();

        dashboardPage.navigateToModule("Activities","Calendar Events");

    }

    @Test
    public void test1(){

        goToCalenderEvent();

       Assert.assertTrue(calendarEventsPage.optionElement.isDisplayed(),"verify optionelement is displayed");

    }

    @Test
    public void test2(){

        /*goToCalenderEvent();

        WebElement pageNumberElement = driver.findElement(By.xpath("//input[@type='number']"));
*/




    }

    @Test
    public void test3(){

       /* goToCalenderEvent();

        WebElement perPageNumberElement = driver.findElement(By.cssSelector("button[class='btn dropdown-toggle ']"));
*/





    }


    @Test
    public void test4(){

        /*goToCalenderEvent();

        WebElement numberOfRecord = driver.findElement(By.xpath("//label[.='Total of 1561 records']"));


        Assert.assertTrue(numberOfRecord.isDisplayed());


*/

    }

    @Test
    public void test5(){

        goToCalenderEvent();

        BrowserUtils.waitFor(5);

       calendarEventsPage.topChecbox.click();



       Assert.assertTrue(calendarEventsPage.allSelected.isDisplayed(),"verify that allselected are displayed");

    }

    @Test
    public void test6() throws InterruptedException {

        goToCalenderEvent();

        BrowserUtils.waitFor(10);

        WebElement testerMeeting = driver.findElement(By.xpath("///tbody/tr[1]"));

        BrowserUtils.waitFor(10);

        testerMeeting.click();



//        WebElement dataTesterMeeting = driver.findElement(By.cssSelector("form-horizontal"));

    }



}
