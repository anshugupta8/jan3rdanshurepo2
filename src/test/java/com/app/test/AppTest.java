package com.app.test;

import com.app.pages.DocumentionPage;
import com.app.pages.DownloadPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;


public class AppTest {

    protected WebDriver driver;
    protected Properties props;
    DownloadPage download;
    DocumentionPage document;
    @BeforeMethod
    public void setUp()
    {
        String driverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        download=new DownloadPage(driver);
        document=new DocumentionPage(driver);
        driver.get("https://www.selenium.dev/");
    }

    @Test
    public void verifyDownloadPage()
    {
        download.launchDownloads();
        download.verifyDownloadsPage();
    }
    @Test
    public void verifyDocumentPage()
    {
        document.launchDocumentation();
        document.verifyDocumentationsPage();
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
