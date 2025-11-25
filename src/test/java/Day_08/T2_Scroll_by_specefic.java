package Day_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Scroll_by_specefic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to the mortgage calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2500);

        //call the scroll method
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        //Scroll to an specific element
        WebElement LoanView = driver.findElement(By.xpath("//*[@id='toggle_pie']"));
        //Scroll to LoanView element
        jse.executeScript("arguments[0].scrollIntoView(true);",LoanView);
    }//end of main
}//end of class
