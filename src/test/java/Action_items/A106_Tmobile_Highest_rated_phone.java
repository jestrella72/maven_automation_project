package Action_items;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//I want to be able to select the highest rated Iphone and click on it
public class A106_Tmobile_Highest_rated_phone {
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
        logger = reports.startTest("Hightest Rated Phone");
        driver.navigate().to("https://www.t-mobile.com/");
        //use reusable method to click on element create custom reusable method to click on popup
        //Click on x button
        Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");

    //Click on the Shop Now button
      Reusable_Actions.clickActionLogger(driver,"//*[@aria-label='Shop now']",logger,"Click on Drop Down");
//Now we sort and filter for the highest rated phone
        Reusable_Actions.clickActionLogger(driver,"//*[@class='mat-select-arrow-wrapper ng-tns-c145-23']",logger,"Click on Drop Down");
        Reusable_Actions.clickActionLogger(driver,"//span[contains(text(),'Highest Rating')]",logger,"Highest rating");
        //Now Click the Iphone 13 max pro
        Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
        Thread.sleep(3000);
        Reusable_Actions.clickByIndexActionLogger(driver,"//*[@data-testid='product-card-family-name']",logger,0,"Click on Iphone 13 max pro");

        Thread.sleep(5000);
        //end the logger per test
        reports.endTest(logger);
        //Now we scroll down
        }
      @AfterSuite
    public void quitSession() {
        driver.close();
        reports.flush();
    }
}//end of after suite

