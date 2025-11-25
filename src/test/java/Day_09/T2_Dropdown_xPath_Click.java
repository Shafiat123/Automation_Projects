package Day_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Dropdown_xPath_Click {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to morgatge calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2500);

        //select december from the dropdown box
        driver.findElement(org.openqa.selenium.By.xpath("//*[@name='param[start_month]']")).click();
        driver.findElement(By.xpath("//*[text()='Dec']")).click();

    }//end of main
}//end of class
