package Day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.xpath.XPath;
import java.util.ArrayList;

public class T2_Array_List_WebElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to bing website
        driver.navigate().to("https://www.bing.com");

        //wait 2 second
        Thread.sleep(2000);

        //Store all the top link as a arraylist webelement so we can click on them one by one
        ArrayList<WebElement> lists = new ArrayList<>(driver.findElements(By.xpath("//*[@role = 'menuitem']")));
        lists.get(3).click();
    }//end of main
}//end of class
