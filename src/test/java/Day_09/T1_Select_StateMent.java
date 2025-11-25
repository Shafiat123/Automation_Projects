package Day_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_StateMent {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigate to morgatge calculator website
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2500);

        //select december from the dropdown box
        WebElement startMonth = driver.findElement(org.openqa.selenium.By.xpath("//*[@name='param[start_month]']"));

        Select dropdown = new Select(startMonth);
        //dropdown.selectByVisibleText("Dec");

        //selecting the december in index way
        //dropdown.selectByIndex(11);
        //selecting by value
        dropdown.selectByValue("12");
    }// end of main
}// end of class
