package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DownloadPage {

    WebDriver driver;

    public DownloadPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void launchDownloads()
    {
        driver.findElement(By.linkText("Downloads")).click();
        String actualPageTitle=driver.getTitle();
        String expectedPageTitle="Downloads | Selenium";
        Assert.assertEquals(actualPageTitle,expectedPageTitle,"Downloads page not loaded");
    }
    public void verifyDownloadsPage()
    {

        String actualHeader=driver.findElement(By.xpath("//*[@id=\"td-cover-block-0\"]/div/div/div/div/h1")).getText();
        String expectedHeader="Downloads";
        Assert.assertEquals(actualHeader,expectedHeader,"Downloads header is incorrect" );

    }
}
