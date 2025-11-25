package Day_13;

import Reusuable_Method.Static_Method;
import Reusuable_Method.Static_Method_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_Logger {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;


    @BeforeSuite
    public void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //define the report path
        reports = new ExtentReports("src/html_report/AutomationReport.html",true);

        logger = reports.startTest("Bing Search Test with Logger");
    }//end of setupDriver

    @AfterSuite
    public void quitDriver() {
        driver.quit();
        //end of the logger/status
        reports.endTest(logger);
        //write everything to the report
        reports.flush();
    }//end of quitDriver


    @Test
    public void BingSearchTest() throws InterruptedException {
        //navigate to bing website
        driver.navigate().to("https://www.bing.com");
        //enter cars on search field
        Static_Method_Logger.sendKeysMethod(driver, "//*[@name='q']", "Cars", "Search Field", logger);
        Thread.sleep(2000);
        //click on search button
        driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
    }//end of Test01

    @Test(dependsOnMethods = "BingSearchTest")
    public void SearchResultPage(){
        //click on search tab
        Static_Method_Logger.clickMethod(driver,"//*[@id='b-scopeListItem-copilotsearch']","Search Tab", logger);
        //capture the generated ai result
        String result = Static_Method_Logger.getTextMethod(driver,"//*[@class='b_cs_disclaimer']","AI Result", logger);

        System.out.println("AI result is " + result);
    }

}
