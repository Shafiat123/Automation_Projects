package Day_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_fInd_elements {
    public static void main(String[] args) throws InterruptedException {
        //chrome option in selenium that utilizes some pre condition for your chrome browser
        //initialize chrome option object
        ChromeOptions option = new ChromeOptions();
        //maximize the chrome browser
        option.addArguments("start-maximized");
        //incognito mode to open the browser
        option.addArguments("incognito");
        //headless mode to open the browser
        //option.addArguments("headless");

        //initialize the webdriver with chrome option
        WebDriver driver = new ChromeDriver(option);
        //navigate to bing website
        driver.navigate().to("https://www.uhc.com");
        Thread.sleep(3000);

        //click on shop insurance option
        driver.findElement(org.openqa.selenium.By.xpath("//*[text()='Shop insurance']")).click();
        //click on Medicaid plans
        driver.findElements(org.openqa.selenium.By.xpath("//*[text()='Medicaid']")).get(3).click();
Thread.sleep(4000);
        driver.quit();
    }//end of main
}//end of class
