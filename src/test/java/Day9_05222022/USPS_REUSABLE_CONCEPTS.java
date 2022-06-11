package Day9_05222022;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class USPS_REUSABLE_CONCEPTS {
    //declare the local driver outside so that It can be reusable with other annotation methods.
    public static void main(String[] args) {
        //setting the local driver to reusable set driver
        WebDriver driver = Reusable_Actions.setDriver();
            driver = Reusable_Actions.setDriver();
            //define path to report
            //setting the local driver to resuable set driver method

            //navigate to usps
            driver.navigate().to("https://www.usps.com");
            //hovering to quick tools
            Reusable_Actions.mouseHover(driver, "//*[text() ='Quick Tools']", "Quick Tools");
            //hovering to send tab
            Reusable_Actions.mouseHover(driver, "//*[@id='mail-ship-width']", "Send Tab");
            //click on calculate a price
            Reusable_Actions.clickAction(driver, "//*[@class='tool-calc']", "calculate a price");
            //enter the zipcode
            Reusable_Actions.sendKeysAction(driver, "//[@id='Origin']", "11218", "Zip Code");

            driver.quit();
            }
        }
