package Day_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GetTitle {
    public static void main(String[] args) {
        //initialize the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to google website
        driver.navigate().to("https://www.google.com");
        //capture the title
        String title = driver.getTitle();
        //capture if the title matched to google
        if (title.equals("Google")) {
            System.out.println("The title has been matched");
        } else {
            System.out.println("Title doesn't match. Actual title is: " + title);
        }
    }//end of main
}//end of class
