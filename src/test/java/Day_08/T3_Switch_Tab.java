package Day_08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T3_Switch_Tab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the fidelis care website
        driver.navigate().to("https://www.fideliscare.org");
        //click on shop for a plan which opens a new tab
        driver.findElements(By.xpath("//*[text()='Shop For a Plan']")).get(0).click();
        Thread.sleep(2000);
        //clicking on shop for a plan
        driver.findElements(By.xpath("//*[text()='Shop for a Plan']")).get(0).click();

        //scroll down to see the search button to click on search
        //call the scroll method
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Search for a medical professional')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);",element);

        //click on the search link
        driver.findElements(By.xpath("//*[@type='button']")).get(7).click();

        //store your tabs in an array list
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to tab 02
        driver.switchTo().window(tabs.get(1));
        //enter zip code on the new tab 02
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='searchLocation']")).sendKeys("14214");
        //driver.findElement(By.xpath("//*[@id='searchLocation']")).sendKeys("14214");
    }//end of main
}//end of class
