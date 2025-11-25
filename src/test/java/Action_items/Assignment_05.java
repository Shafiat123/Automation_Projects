package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class Assignment_05 {
    public static void main(String[] args) throws InterruptedException {
        //declaring chrome options for incognito and maximized mode
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized", "incognito");
        //create a arraylist for zip codes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11218");
        zipCodes.add("11219");
        zipCodes.add("11220");
        //initialize the driver through chrome options
        WebDriver driver = new ChromeDriver(option);

        for (int i = 0; i < zipCodes.size(); i++) {
            //navigate to weight watchers website
            driver.navigate().to("https://www.weightwatchers.com/us/");
            Thread.sleep(2000);

            //click on find a workshop
            driver.findElements(By.xpath("//*[text()='Find a Workshop']")).get(0).click();
            Thread.sleep(2000);
            //click on in person option
            //driver.findElements(By.xpath("//*[text()='In-Person']")).get(0).click();
            //Thread.sleep(2000);
            WebElement searchBox = driver.findElement(By.xpath("//*[@title='location-search']"));
            //clear the search box
            searchBox.clear();
            //enter zip code from array list
            searchBox.sendKeys(zipCodes.get(i));
            //click on search button
            driver.findElements(By.xpath("//*[@type='submit']")).get(0).click();
            //Wait for 3 seconds
            Thread.sleep(3000);

            //scroll to the studio results
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,400)");
            Thread.sleep(2000);

            List<WebElement> studioNames = new ArrayList<>(driver.findElements(By.xpath("//*[@class='linkUnderline-XyxpJ']")));
            studioNames.get(0).click();
            Thread.sleep(1500);
            //capture the entire address and store it into a string variable
            String address = driver.findElement(By.xpath("//*[@class='address-FnT8k']")).getText();
            //print the address for each zip code
            System.out.println("The studio address for zip code " + zipCodes.get(i) + " is: " + address);

            //scroll down to the in-person workshop section
            jse.executeScript("scroll(0,600)");
            Thread.sleep(2000);

            //capture the schedule and print it out
            System.out.println(driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-ps6Rm']")).getText());

        }//end of for loop
        driver.quit();
    }//end of main
}//end of class