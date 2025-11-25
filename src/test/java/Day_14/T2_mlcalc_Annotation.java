package Day_14;

import Reusuable_Method.Annotation_Methods;
import Reusuable_Method.Static_Method_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T2_mlcalc_Annotation extends Annotation_Methods {

    @Test
    public void CalculateMonthlyPayment(){
        //navigate to mlcalc website
        driver.navigate().to("https://www.mlcalc.com");

        //enter purchase price
        Static_Method_Logger.sendKeysMethod(driver, "//*[@name = 'ma']","450000","Purchase Price",status);
        //enter down payment
        Static_Method_Logger.sendKeysMethod(driver, "//*[@name = 'dp']","50000","Down Payment",status);
        //click on calculate rate
        Static_Method_Logger.clickMethod(driver,"//*[@value='Calculate']","Calculate Button",status);
        //capture monthly payment
        String monthlyPayment = Static_Method_Logger.getTextMethod(driver,"//*[@style='font-size: 32px']","Monthly Payment",status);
        System.out.println("Monthly payment is " + monthlyPayment);
        status.log(LogStatus.INFO, "Monthly payment is " + monthlyPayment);
    }//end of test method

}//end of class
