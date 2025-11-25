package Reusuable_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Static_Method {

    //method to click on any element
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickMethod

    //method to click element by index
    public static void clickByIndex(WebDriver driver, String xpath, int index, String elementName) {

        //define explicit wait
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + " " + e);
        }
    }//end of clickByIndex

    //method to sendKeys element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
        } catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + " " + e);
        }
    }


    //method to return a value from any element using getText
    public static String getTextMethod(WebDriver driver, String xpath, String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //initialize a return value so it can be returned outside the try catch
        String returnValue = "";
        try {
            returnValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
        }
        catch (Exception e) {
            System.out.println("Unable to get text on element " + elementName + " " + e);
        }
        return returnValue;
    }//end of getTextMethod


}//end of class
