package Day_14;

import Reusuable_Method.Annotation_Methods;
import Reusuable_Method.Static_Method_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_Bing_ReusableAnnotation extends Annotation_Methods {

    @Test
    public void getCoPilotInfo() throws InterruptedException {
        //navigate to the bing website
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(2000);
        //click on co pilot icon
        Static_Method_Logger.clickMethod(driver,"//*[text()='Copilot']","CoPilot Icon",status);
        //Arraylist to switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String result = Static_Method_Logger.getTextMethod(driver,"//*[@class='text-xl']","Text Info",status);
        System.out.println("Copilot info: " + result); //this one is for intelegi result console
        status.log(LogStatus.INFO, "Copilot info is " + result); //this one for actual report for the test
    }//end of test1

    @Test(dependsOnMethods = "getCoPilotInfo")
    public void SendMessageAndVerify() {
    Static_Method_Logger.sendKeysMethod(driver, "//*[@id = 'userInput']","Testing","Text Field",status);
    Static_Method_Logger.clickMethod(driver,"//*[@data-testid='submit-button']","Send Button",status);
    String message = Static_Method_Logger.getTextMethod(driver, "//*[@data-testid='date-divider']","Message Text",status);
        System.out.println("Message sent is " + message);
        status.log(LogStatus.INFO, "Message sent is " + message);
    }

}//end of class
