package com.cybertek.tests.day13_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesExampleX {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }



    @Test

    public void printTable(){

        WebElement table1=driver.findElement(By.xpath("//table[1]"));

        System.out.println("table1.getText() = " + table1.getText());

        Assert.assertTrue(table1.getText().contains("fbach@yahoo.com"));

    }

    @Test
    public void getAllHeaders(){

        //how many columns we have ?
        List<WebElement> headers=driver.findElements(By.xpath("(//table)[1]//th"));

        //print each column name one by one
        for (WebElement header : headers) {
            System.out.println("header.getText() = " + header.getText());
        }
    }

    @Test
    public void printTableSize(){
        //how many columns we have ?
        List<WebElement> headers=driver.findElements(By.xpath("(//table)[1]//th"));

        System.out.println("headers.size() = " + headers.size());


        //number of rows with header
        List<WebElement> colomnWithHeaders=driver.findElements(By.xpath("(//table)[1]//tr"));

        System.out.println("colomnWithHeaders.size() = " + colomnWithHeaders.size());

        //number of rows without header(we prefer this)

        List<WebElement> colomnWitoutHeaders=driver.findElements(By.xpath("(//table)[1]//tbody/tr"));

        System.out.println("colomnWitoutHeaders.size() = " + colomnWitoutHeaders.size());


    }

    @Test
    public void getRow(){
        //print the second row information
        WebElement secondRow=driver.findElement(By.xpath("(//table)[1]//tbody/tr[2]"));

        System.out.println("secondRow.getText() = " + secondRow.getText());
        //get all the rows dynamically
        //1.find the number of rows
        //2.iterate one by one
        List<WebElement> allRows=driver.findElements(By.xpath("(//table)[1]//tbody/tr"));
        System.out.println("allRows.size() = " + allRows.size());

        for (WebElement allRow : allRows) {
            System.out.println("allRow.getText() = " + allRow.getText());
        }
    }



    @Test
    public void getAllCellInOneRow(){

        List<WebElement> row3Cells=driver.findElements(By.xpath("(//table)[1]//tbody/tr[3]/td"));

        System.out.println("row3Cells.size() = " + row3Cells.size());

        for (WebElement row3Cell : row3Cells) {
            System.out.println("row3Cell.getText() = " + row3Cell.getText());
        }
    }



    @Test
    public void getASingleCellByIndex(){

        WebElement cell=driver.findElement(By.xpath("(//table)[1]//tbody/tr[3]/td[3]"));
        System.out.println("cell.getText() = " + cell.getText());

    }



    @Test
    public void PrintAllCellsByIndex(){

        int rowNumber=getNumberOfRows();
        int colNumber=getNumberOfCols();

        System.out.println("rowNumber = " + rowNumber);
        System.out.println("colNumber = " + colNumber);

        //iterate through each row on the table
        for (int i = 1; i <= rowNumber; i++) {

            for (int j = 1; j <=colNumber; j++) {

                String cellXpath="(//table)[1]//tbody/tr["+i+"]/td["+j+"]";

                System.out.println("cellXpath = " + cellXpath);

                WebElement cell=driver.findElement(By.xpath(cellXpath));

                System.out.println("cell.getText() = " + cell.getText());
            }
        }
    }




    private int getNumberOfCols() {
        //how many columns we have ?
        List<WebElement> headers=driver.findElements(By.xpath("(//table)[1]//th"));
        return headers.size();
    }


    private int getNumberOfRows() {
        //get all the rows dynamically
        //1.find the number of rows
        //2.iterate one by one
        List<WebElement> allRows=driver.findElements(By.xpath("(//table)[1]//tbody/tr"));
        return allRows.size();
    }





    //create a method that accepts row and col number, and returns the cell as a webelement
     public WebElement cellMethod(int row, int col ) {

        WebElement cells = null;

                String xPathCells = "//table[1]//tbody//tr[" + row + "]//td[" + col + "]";

                cells = driver.findElement(By.xpath(xPathCells));

        return cells;
    }


    @Test

    public void printCellByMethod(){

        WebElement cell = cellMethod(1,3); // -->call method and any number of row and column of cell

        System.out.println("cell = " + cell.getText());
    }
}
