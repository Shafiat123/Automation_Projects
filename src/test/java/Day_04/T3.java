package Day_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {
    public static void main(String[] args) throws InterruptedException {
        //initiate and define the webdriver
        WebDriver driver = new ChromeDriver();

        //navigate to google website & make it wait 3 second
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(3000);
        //enter a keyword lets say sport on the search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricket");
        //click on search button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='search_icon']")).click();
        //capture the result and print it
        String results= driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
        System.out.println("Result is " + results);
        //print only the search number from the search result
        String[] arrayList = results.split(" ");
        System.out.println("Search number is " + arrayList[1]);
    }//end of main
}//end of class
