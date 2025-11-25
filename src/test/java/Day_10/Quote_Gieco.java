package Day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quote_Gieco {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //navigate to geico home page
        driver.navigate().to("https://www.geico.com");
        //enter zip code
        driver.findElement(By.xpath("//*[@id='ssp-service-zip']")).sendKeys("11218");
        //click on home owner quote button
        driver.findElements(By.xpath("//*[@class = 'product-checkbox']")).get(1).click();
        //click on start quote button
        driver.findElements(By.xpath("//*[@type='submit']")).get(2).click();

        Thread.sleep(2500);

        //input the first name
        WebElement firstname = driver.findElement(By.xpath("//*[@aria-label='First Name']"));
        firstname.sendKeys("John");
        //input the last name
        WebElement lastname = driver.findElement(By.xpath("//*[@aria-label='Last Name']"));
        lastname.sendKeys("Doe");
        //input DOB
        WebElement dob = driver.findElement(By.xpath("//*[@aria-label='Date of Birth']"));
        dob.sendKeys("01/01/1990");

        //now hit on continue button
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        Thread.sleep(2000);

        //input the address
        WebElement address = driver.findElement(By.xpath("//*[@type='search']"));
        address.sendKeys("123 Test St");
        //hit the next  button
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        //print the error message "We couldn't find an address that matches"
        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.xpath("//*[@id='Id_AboveWidgetText_Container_64771']")).getText();
        System.out.println(errorMessage);
    }//end of main
}//end of class
