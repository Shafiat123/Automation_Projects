package Day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Contains {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to the bing website
        driver.navigate().to("https://www.bing.com");
        //wait for few seconds
        Thread.sleep(2000);
        //use contains in xpath to enter a keyword on search field
        //contains remove the space after a keyword like scope on bing website inspect element
        driver.findElements(By.xpath("//*[contains(@class,'scope')]")).get(2).click();
    }//end of main
}//end of class

