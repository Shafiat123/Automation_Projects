package Day_11;

import Reusuable_Method.Static_Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_bing_reuseable {
    public static void main(String[] args) {
        //setup webdriver for chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to bing website
        driver.navigate().to("https://www.bing.com");
        //enter "cars" on search field
        Static_Method.sendKeysMethod(driver,"//*[@name='q']","Cars","Search Field");

        //click on search button
        Static_Method.clickMethod(driver,"//*[@id='search_icon']","Search Button");

    }//end of main
}//end of class
