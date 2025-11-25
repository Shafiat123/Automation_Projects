package Reusuable_Method;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class Annotation_Methods {
        //initialize all the global variables needed in this whole code
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest status;

    @BeforeSuite
    public void setupDriver(){
        //initialize the driver here
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //initialize the extent reports here
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
    }

    @AfterSuite
    public void quitDriver(){
        driver.quit();
        //end the logger/status
        reports.endTest(status);
        //write everything to the report
        reports.flush();
    }


    @BeforeMethod
    public void CaptureTestName(Method methodName){
        //this method will capture the test name before every @Test annotation method
        status = reports.startTest(methodName.getName());

    }



}//end of class
