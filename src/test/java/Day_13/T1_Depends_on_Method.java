package Day_13;

import Reusuable_Method.Static_Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_Depends_on_Method {
    WebDriver driver;

    @BeforeSuite
    public void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }//end of setupDriver

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }//end of quitDriver

    @Test
    public void BingSearchTest() throws InterruptedException {
        //navigate to bing website
        driver.navigate().to("https://www.bing.com");
        //enter cars on search field
        Static_Method.sendKeysMethod(driver, "//*[@name='q']", "Cars", "Search Field");
        Thread.sleep(2000);
        //click on search button
        driver.findElements(By.xpath("//*[@fill='none']")).get(4).click();

        }//end of Test01

    @Test(dependsOnMethods = "BingSearchTest")
    public void SearchResultPage(){
        //click on search tab
        Static_Method.clickMethod(driver,"//*[@id='b-scopeListItem-copilotsearch']","Search Tab");
        //capture the generated ai result
        String result = Static_Method.getTextMethod(driver,"//*[@class='b_cs_disclaimer']","AI Result");
        System.out.println("AI result is " + result);
    }

}
