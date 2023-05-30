package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeworkFindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementsByCssTest() {
        //id -> css(#)
        //driver.findElement.(By.id("city");
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#bar-notification"));

        //class -> css(.)
        //driver.findElement(By.className("header"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector(".top-menu"));

//        //attribute -> css([])
//        driver.findElement(By.cssSelector("[type='submit']"));

        //contains -> *
        driver.findElement(By.cssSelector("[name*='NewsletterEmail']"));
        //start with -> ^
        driver.findElement(By.cssSelector("[data-valmsg-for^='NewsletterEmail']"));
        //end on -> $
        driver.findElement(By.cssSelector("[value$='Subscribe']"));
    }

    @Test
    public void findElementByXpathTest() {
        //id -> xpath //*[@id='value']
        //driver.findElement.(By.id("city");
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));

        //class -> xpath //*[@class='value']
        //driver.findElement(By.className("header"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='top-menu']"));

        //contains, end on, start -> //*[contains(.,'text')]
        driver.findElement(By.xpath("//*[contains(.,'Sign up for our newsletter:')]"));
        driver.findElement(By.xpath("//*[contains(.,'Welcome to our store')]"));

    }

}
