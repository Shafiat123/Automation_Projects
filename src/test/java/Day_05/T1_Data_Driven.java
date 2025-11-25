package Day_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_Data_Driven {
    public static void main(String[] args) throws InterruptedException {
        //initialize array list for sports
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Hockey");
        sports.add("Golf");
        //define the webdriver here. note: Dont place it inside the for loop
        WebDriver driver = new ChromeDriver();

        //create a loop to iterate through the sports array list
        for (int i = 0; i < sports.size(); i++) {

        // navigate to bing home page
        driver.navigate().to("https://www.bing.com");

        //enter a keyword from the array list on the search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));

        //submit on the search field
        driver.findElement(By.xpath("//*[@id='search_icon']")).submit();

        //wait for 2 seconds
            Thread.sleep(2000);

        //capture and store the search res
        //String results = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

        //print out the result
        //System.out.println("Search result for " + sports.get(i) + " is: " + results);

        }//end of loop
    }//end of main
}//end of class
