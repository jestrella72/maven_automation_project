package Action_items;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//I want to be able to select a plan and since I am already a T-Mobile customer I want to test out my Phone number to see if get an error message
public class A106_Tmobile_Unlimited_Plan {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;
    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }//end of before suite annotation
    //test case 1: navigate to google and enter a keyword on search field
    @Test
    public void ShopNow() throws InterruptedException {
        logger = reports.startTest("T-mobile Unlimted Plan");
        driver.navigate().to("https://www.t-mobile.com/");
        //use reusable method to click on element create custom reusable method to click on popup
        //Click on x button
        Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");
      //Now I hover over the plans dropdown
        Reusable_Actions.mouseHover(driver,"//*[@href='/cell-phone-plans?INTNAV=tNav%3APlans']","Hover over Plans");
    //I want to click on unlimited plans and scroll down to the page
    Reusable_Actions.clickActionLogger(driver,"//*[text()='Unlimited Phone Plans']",logger,"Click on Unlimted plan");
        Thread.sleep(3000);
        Reusable_Actions.scrollWebPage(driver, "scroll(0,900)");
        //Now I want to select the plan I want which is Magenta Max
        Reusable_Actions.clickByIndexActionLogger(driver,"//*[@data-testid='select-phone-plan']",logger,0,"Click on Magenta Max");
//Now click on continue to the cart
        Reusable_Actions.clickActionLogger(driver,"//*[@data-testid='nplans-line-selector-next']",logger,"Click on continue to the cart");
    //Now scroll down to the bottom of the page
        Thread.sleep(3000);
        Reusable_Actions.scrollWebPage(driver, "scroll(0,1500)");
        Reusable_Actions.clickActionLogger(driver,"//*[@data-testing='device-selector-byod']",logger,"Click on Bring your own device");
        //Now scroll down to phone number
        Thread.sleep(3000);
        Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
        //Since I am already a T-mobile customer I want to test out my Phone number to see if I can get an error
        Reusable_Actions.clickActionLogger(driver,"//*[@id='phoneNumber']",logger,"Click on search box");
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@id='phoneNumber']","9175131991",logger,"Click on search box");
        Reusable_Actions.clickActionLogger(driver,"//*[@data-testid='validate-number']",logger,"Click on check this number");
        Thread.sleep(4000);
        String result = Reusable_Actions.getTextActionLogger(driver,"//*[@class='mat-error error-text']",logger,"Already a T-Mobile customer please click here to login");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Already a T-Mobile customer please click here to login " + arrayResult[1]);
        //string error messege
        reports.endTest(logger);
        //end the logger per test
    }//End test
    @AfterSuite
    public void quitSession() {
        driver.close();
        reports.flush();
    }
}//end of after suite
