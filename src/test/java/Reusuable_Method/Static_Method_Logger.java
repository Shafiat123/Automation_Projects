package Reusuable_Method;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Static_Method_Logger {

    //method to click on any element
    public static void clickMethod(WebDriver driver, String xpath, String elementName, ExtentTest status) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            status.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            status.log(LogStatus.FAIL, "Unable to click on " + elementName + " " + e);
        }
    }//end of clickMethod

    //method to click element by index
    public static void clickByIndex(WebDriver driver, String xpath, int index, String elementName, ExtentTest status) {

        //define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).submit();
            status.log(LogStatus.PASS, "Successfully clicked on " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
            status.log(LogStatus.FAIL, "Unable to click on " + elementName + " " + e);
        }
    }//end of clickByIndex

    //method to sendKeys element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName, ExtentTest status) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {

            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)))
                    element.clear();
                    element.sendKeys(userValue);
            status.log(LogStatus.PASS, "Successfully sent keys on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + " " + e);
            status.log(LogStatus.FAIL, "Unable to send keys on " + elementName + " " + e);
        }
    }


    //method to return a value from any element using getText
    public static String getTextMethod(WebDriver driver, String xpath, String elementName, ExtentTest status) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //initialize a return value so it can be returned outside the try catch
        String returnValue = "";
        try {
            returnValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
        status.log(LogStatus.PASS, "Successfully captured text on " + elementName);
        }
        catch (Exception e) {
            System.out.println("Unable to get text on element " + elementName + " " + e);
            status.log(LogStatus.FAIL, "Unable to get text on " + elementName + " " + e);
        }
        return returnValue;
    }//end of getTextMethod


}//end of class
