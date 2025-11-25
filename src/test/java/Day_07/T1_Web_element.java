package Day_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_Web_element {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome option and maximize the browser
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized", "incognito");

        WebDriver driver = new ChromeDriver(option);

        //navigate to mlcalc website
        driver.navigate().to("https://www.mlcalc.com");

        //Hold 3 second with the website to load
        Thread.sleep(2000);

        //Clear the existing value on the home value field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name = 'ma']"));
        pPrice.clear();

        //enter a different value
        pPrice.sendKeys("400000");


    }//end of main
}//end of class
