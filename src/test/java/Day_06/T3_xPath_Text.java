package Day_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_xPath_Text {
    public static void main(String[] args) throws InterruptedException {
        //chrome option in selenium that utilizes some precondtion for your chrome browser
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

    }//end of main
}//end of class
