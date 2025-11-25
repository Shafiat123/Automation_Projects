package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_03 {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver
        WebDriver driver = new ChromeDriver();

        //navigate to Yahoo webside and let it wait 3 second
        driver.navigate().to("https://search.brave.com/");
        Thread.sleep(3000);
        //let something search on yahoo website and wait 2 second
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("Cricket");
        Thread.sleep(2000);
        //Clicking on search button
        driver.findElement(By.xpath("//*[@id='submit-button']")).click();
        //capture the result and print it
        String result = driver.findElement(By.xpath("//*[@class = 'svelte-jhdlhi']")).getText();
        //System.out.println("Result is " + result);
        //print only the country
        String[] arrayList = result.split(" ");
        // Trying to print the whole country name
        String country01 = arrayList[0];
        String country02 = arrayList[1];
        String Full_Country = country01 + " " + country02;
        System.out.println("Searching location is: " + Full_Country );

        //quit the session
        driver.quit();

    }//end of main
}//end of class
