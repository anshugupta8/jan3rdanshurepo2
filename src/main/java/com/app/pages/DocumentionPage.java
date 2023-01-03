package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DocumentionPage {

    WebDriver driver;
    public DocumentionPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void launchDocumentation()
    {
        driver.findElement(By.linkText("Documentation")).click();
        String actualPageTitle=driver.getTitle();
        String expectedPageTitle="The Selenium Browser Automation Project | Selenium";
        Assert.assertEquals(actualPageTitle,expectedPageTitle,"Documentation page not loaded");
    }
    public void verifyDocumentationsPage()
    {

    }
}
