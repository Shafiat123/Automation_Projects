package Day_12;

import Reusuable_Method.Static_Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_GetText_method {
    public static void main(String[] args) {

        //setting the webdriver
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);
        //navigate to aol website
        driver.navigate().to("https://www.aol.com");

        //Enter keyword on search field
        Static_Method.sendKeysMethod(driver, "//*[@name='q']","Cars","Search Field");

        //click on search icon
        Static_Method.clickMethod(driver, "//*[@name='submitIcon']","Search Icon");

        //capture & print the search result
        String result = Static_Method.getTextMethod(driver, "//*[@class='dd fst lst']","Search Result");
        String [] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);

    }//end of main
}//end of class
