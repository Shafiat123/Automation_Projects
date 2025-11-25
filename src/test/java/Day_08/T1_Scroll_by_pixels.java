package Day_08;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Scroll_by_pixels {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the mortgage calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");

        Thread.sleep(2000);

        //call the scroll method
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //Scroll down by 550px
        jse.executeScript("scroll(0,550);");
        Thread.sleep(2000); //This will pause for your view
        //Scroll up by 400px
        jse.executeScript("scroll(0,-550);");


    }//end of main
}//end of class
