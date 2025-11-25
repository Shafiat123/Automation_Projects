package Day_03;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic03_WebDriver {
    public static void main(String[] args) throws InterruptedException {

        //set up your webdriver to use a specific browser you want
        WebDriver driver = new ChromeDriver();
        //navigate to an url to open your browser
        driver.navigate().to("https://www.google.com");
        // maximize the browser/driver
        driver.manage().window().maximize();
        //wait 2 second before closing
        Thread.sleep(2000);
        //close the browser/driver
        driver.close();
    }//end of main
}//end of class
