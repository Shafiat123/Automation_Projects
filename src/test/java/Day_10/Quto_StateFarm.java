package Day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quto_StateFarm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to state farm website
        driver.navigate().to("https://www.statefarm.com");
        Thread.sleep(1500);
        //clicking on get a quote button
        driver.findElement(org.openqa.selenium.By.xpath("//*[text() = 'Get a Quote']")).click();
        //select dropdown as homeowner
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='product-select1']"));
        //using select statement to select dropdown
        Select owner = new Select(dropdown);
        owner.selectByIndex(3);

        //now enter zip code
        driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("11218");
        //click on start quote button
        driver.findElement(By.xpath("//*[@id='quote-submit-button1']")).click();
        Thread.sleep(2000);

        //now enter the policy start date
        driver.findElement(By.xpath("//*[@id='policy-start-date']")).sendKeys("12-31-2025");


        //end the session
        driver.quit();
    }//end of main
}//end of class
