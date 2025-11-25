package Action_items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Assignment_04 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> doctors = new ArrayList<>();
        doctors.add("Dentist");
        doctors.add("Cardiologist");
        doctors.add("Neurologist");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);
        for (int i = 0; i < doctors.size(); i++) {
            driver.navigate().to("https://www.webmd.com/");
            //verify the title of webMD website
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("WebMD - Better information. Better health.")) {
                System.out.println("Title matches for WebMD");
            } else {
                System.out.println("Title doesn't match for WebMD. Actual title is: " + actualTitle);
            }
            Thread.sleep(2000);
            //click on find a doctor
            driver.findElements(By.xpath("//*[text()='Find a Doctor']")).get(0).click();
            //Wait for 2 seconds
            Thread.sleep(2000);

            //then click on view all on find a doctor page
            driver.findElements(By.xpath("//*[text()=' View All ']")).get(0).click();

            //enter array values in the search box
            driver.findElement(By.xpath("//*[@id='searchkeywords_desktop']")).sendKeys(doctors.get(i));
            //click on search button
            driver.findElements(By.xpath("//*[@class='webmd-icon-search']")).get(1).click();
            Thread.sleep(4000);

            //Split the searched result and print only the number
            String result = driver.findElement(By.xpath("//*[@class='count-txt']")).getText();
            String[] arrayResult = result.split(" ");
            System.out.println("For " + doctors.get(i) + " the number of search results is: " + arrayResult[0]);

        }
        driver.quit();
    }//end of main
}//end of class
