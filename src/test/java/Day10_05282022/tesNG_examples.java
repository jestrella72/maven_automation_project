package Day10_05282022;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class tesNG_examples {

    //declare the local driver outside so that It can be reusable with other annotation methods.
    WebDriver driver;

    //before the suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of before suite annotation

    //test case 1: navigate to google and enter a keyword on search field

    @Test(priority = 1)
    public void SearchForKeyWord(){
        driver.navigate().to("https://www.Google.com");
        //enter a keyword on search field
        Reusable_Actions.sendKeysAction(driver,"//*[@name='q']","BMW","Search Field");
    //sumbit the go button
        Reusable_Actions.submitAction(driver,"//*[@name='btnK']","Google Search Button");
    }//end of test 1

    @Test(priority = 2)
    public void CaptureSearchNumber(){
        //capture search result
        driver.navigate().to("https://www.Google.com");
        String result = Reusable_Actions.getTextAction(driver,"//*[@id='result-stats']","Search Result Text");
    //Split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite




}
