package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Relative_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //initiate and define the webdriver
        WebDriver driver = new ChromeDriver();

        //navigate to google website & make it wait 3 second
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        //enter a keyword lets say sport on the search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("sports");
        //click on search button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='search_icon']")).click();


    }//end of main
}//end of class
