package Day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_TRY_CATCH_exception {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //navigate to the mortgage calculator website
        driver.navigate().to("https://www.mlcalc.com/");
        Thread.sleep(2000);

        //clear the existing purchase price to new one
        try{
            WebElement Price = driver.findElement(By.xpath("//*[@name='ma']"));
            Price.clear();
            Price.sendKeys("450000");
        }
        catch (Exception e){
            System.out.println("Unable to locate the element " + e);
        }


        //update the down -payment using the try catch method
        try{
            WebElement downPayment = driver.findElement(By.xpath("//*[@name='dp']"));
            downPayment.clear();
            downPayment.sendKeys("50000");
        }
        catch (Exception e){
            System.out.println("Unable to locate the element " + e);
        }

        // clear and enter new value on interest rate using try catch
        try{
            WebElement interestRate = driver.findElement(By.xpath("//*[@name='ir']"));
            interestRate.clear();
            interestRate.sendKeys("3.5");
        }
        catch (Exception e){
            System.out.println("Unable to locate the element " + e);
        }
        //click on calculate button using try catch
        try {
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
        } catch (Exception e) {
            System.out.println("Unable to locate the element " + e);
        }
        //capture monthly payment using try catch
        try {
            String monthlyPayment = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(0).getText();
            System.out.println("Monthly payment is: " + monthlyPayment);
        } catch (Exception e) {
            System.out.println("Unable to locate the element " + e);
        }

    }//end of main
}//end of class
