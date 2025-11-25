package Day_12;

import Reusuable_Method.Static_Method;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T2_TestNG_annotation {
    //define the global driver
    WebDriver driver;

    @BeforeSuite
    public void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }

    @Test(priority = 1)
    public void TC1_bingSearchTest(){
        //navigate to bing website
        driver.navigate().to("https://www.bing.com");
        //enter cars on search field
        Static_Method.sendKeysMethod(driver,"//*[@name='q']","Cars","Search Field");
        //click on search button
        Static_Method.clickMethod(driver,"//*[@id='search_icon']","Search Button");
    }

    @Test(priority = 2)
    public void TC2_CaptureCopilotText(){
        //navigate to bing website
        driver.navigate().to("https://www.bing.com");
        //click on copilot icon
        Static_Method.clickMethod(driver,"//*[@class='customIcon']","Copilot Icon");
        //switch to copilot tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        // capture the copilot text
        String copilotText = Static_Method.getTextMethod(driver,"//*[class='text-xl']","Copilot Text");
        System.out.println("Copilot text is " + copilotText);
    }
}//end of class
