package Action_items;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//I want to be able to pay as a Guest
public class A106_Tmobile_PayAsGuest {
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
    public void ClickOnMyAccount() throws InterruptedException {
        logger = reports.startTest("Pay As Guest");
        driver.navigate().to("https://www.t-mobile.com/");
        //use reusable method to click on element create custom reusable method to click on popup
        //Click on x button
        Reusable_Actions.popUpHandelClick(driver,"//*[@class='phx-modal__close']","pop up");
        //Click on the My Account DropDown button
        Reusable_Actions.clickActionLogger(driver,"//*[@class='unav-account']",logger,"Click on Drop Down");
        Reusable_Actions.clickActionLogger(driver,"//*[@class='phx-button unav-account__action unav-account__action--login']",logger,"Click on Log In");
        Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
        Thread.sleep(3000);
        Reusable_Actions.clickByIndexActionLogger(driver,"//*[@class='arrow-right-megenta']",logger,1,"Click on pay As Guest");
        Reusable_Actions.clickActionLogger(driver,"//*[@href='/guestpay/landing']",logger,"Click on T-mobile");
    }//End Of Test
    @AfterSuite
    public void quitSession() {
        driver.quit();
        reports.flush();
    }
}//end of after suite