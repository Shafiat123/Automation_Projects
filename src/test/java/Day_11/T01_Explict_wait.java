package Day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T01_Explict_wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the bing website
        driver.navigate().to("https://www.bing.com");

        //setup the wait(explicit) until the page is fully loaded

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='q']"))).sendKeys("cars");

        //click on search icon
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search_icon']"))).click();

        //capture the result and print it
        //String results = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sb_count']"))).getText();
        //System.out.println("Result is " + results);


    }//end of main
}//end of class
