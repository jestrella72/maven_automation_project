package Action_items;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A106_Tmobile {
        WebDriver driver;
        ExtentReports reports;
        ExtentTest logger;
        //before suite will set the driver you are using
        @BeforeSuite
        public void SetChromeDriver() {
            driver = Reusable_Actions.setDriver();
            //define the path to the report
            reports = new ExtentReports("src/main/java/HTML_Report/Automation.html", true);
        }//end of before suite annotation

        //test case 1: navigate to google and enter a keyword on search field
        @Test(priority = 1)
        public void HightestRated() throws InterruptedException {
            logger = reports.startTest("Click On My Account DropDown");
            driver.navigate().to("https://www.t-mobile.com/");
            //use reusable method to click on element create custom reusable method to click on popup
            //Click on x button
            Thread.sleep(3000);
            Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");
            //Click on the Shop Now button
            Reusable_Actions.clickActionLogger(driver, "//*[@aria-label='Shop now']", logger, "Click on Drop Down");
//Now we sort and filter for the highest rated phone
            Thread.sleep(2000);
            Reusable_Actions.clickActionLogger(driver, "//*[@class='mat-select-arrow-wrapper ng-tns-c145-23']", logger, "Click on Drop Down");
            Reusable_Actions.clickActionLogger(driver, "//span[contains(text(),'Highest Rating')]", logger, "Highest rating");
            //Now Click the Iphone 13 max pro
            Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
            Thread.sleep(2000);
            Reusable_Actions.clickByIndexActionLogger(driver, "//*[@data-testid='product-card-family-name']", logger, 0, "Click on Iphone 13 max pro");
            Thread.sleep(2000);
            //end the logger per test
            reports.endTest(logger);
            //Now we scroll down
        }

        @Test(priority = 2)
        public void Highest_Lowest() throws InterruptedException {
            logger = reports.startTest("Click On My Account DropDown");
            driver.navigate().to("https://www.t-mobile.com/");
            Thread.sleep(2000);
            //use reusable method to click on element create custom reusable method to click on popup
            //Click on x button
            Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");

            //Click on the Shop Now button
            Reusable_Actions.clickActionLogger(driver, "//*[@aria-label='Shop now']", logger, "Click on Drop Down");
//Now we sort and filter for the highest to lowest rated phone
            Thread.sleep(2000);
            Reusable_Actions.clickActionLogger(driver, "//*[@class='mat-select-arrow-wrapper ng-tns-c145-23']", logger, "Click on Drop Down");
            Thread.sleep(2000);
            Reusable_Actions.clickActionLogger(driver, "//span[contains(text(),'Price High to Low')]", logger, "Highest rating");
            Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
            Thread.sleep(3000);
            //Now we click on phone
            //create now we verifyTitle on the phone we want
            Reusable_Actions.verifyTitle(driver, "Iphone 13 max pro");
            Reusable_Actions.clickByIndexActionLogger(driver, "//*[@data-testid='product-card-family-name']", logger, 0, "Click on Iphone 13 max pro");
            reports.endTest(logger);
        }

        @Test(priority = 3)

        public void Lowest_Highest() throws InterruptedException {
            logger = reports.startTest("Click On My Account DropDown");
            driver.navigate().to("https://www.t-mobile.com/");
            Thread.sleep(3000);
            //use reusable method to click on element create custom reusable method to click on popup
            //Click on x button
            Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");

            //Click on the Shop Now button
            Reusable_Actions.clickActionLogger(driver, "//*[@aria-label='Shop now']", logger, "Click on Drop Down");
//Now we sort and filter for the Lowest to Highest rated phone
            Reusable_Actions.clickActionLogger(driver, "//*[@class='mat-select-arrow-wrapper ng-tns-c145-23']", logger, "Click on Drop Down");
            Reusable_Actions.clickActionLogger(driver, "//span[contains(text(),'Price Low to High')]", logger, "Highest rating");
            Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
            Thread.sleep(3000);
            //Now we click on phone
            Reusable_Actions.clickByIndexActionLogger(driver, "//*[@data-testid='product-card-family-name']", logger, 0, "Click on Iphone 13 max pro");
            Thread.sleep(3000);
            //end the logger per test
            reports.endTest(logger);

        }

        @Test(priority = 4)
        public void SingUpPhoneNumber() throws InterruptedException {
            logger = reports.startTest("Scroll down");
            driver.navigate().to("https://www.t-mobile.com/");
            //scroll down to the page
            Reusable_Actions.scrollWebPage(driver, "600");
            //Click on sign up
            Reusable_Actions.clickActionLogger(driver, "//*[@id='lp1-signup-btn']", logger, "Click on Sign In");
            //Now we type in the phone number
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@id='usernameTextBox']", "9175131991", logger, "Type In phone number");
            Thread.sleep(3000);
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@id='enterPhoneNumberTextBox']", "9175131991", logger, "Type In phone number");
            //Now we Click on next Button
            Reusable_Actions.clickActionLogger(driver, "//*[@id='epn-submit-btn']", logger, "Click on Next Button");
            //Now I type in my first name,Last name,Email,& password
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@name='firstName']", "Jeffrey", logger, "Type In First Name");
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@name='lastName']", "Estrella", logger, "Type In Last Name");
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@name='Email']", "Jestrella72@gmail.com", logger, "Type In Email");
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@name='password']", "Drmaster12", logger, "Type In password");
            //Now create T-mobile ID
            Thread.sleep(2000);
            Reusable_Actions.clickActionLogger(driver, "//*[@type='button']", logger, "Click on create T-mobile ID");
            Reusable_Actions.clickActionLogger(driver, "//*[@class='arrow fa fa-angle-right']", logger, "Click on create T-mobile ID");
// just in case use contains //span[contains(text(),'Create T-Mobile ID')]
            //Now get a text verifying it you
            reports.endTest(logger);

        }//End of Test 4 of signing up MY Phone Number

        @Test(priority = 5)
        public void UnlimtedPlan() throws InterruptedException {
            logger = reports.startTest("Click On My Account DropDown");
            driver.navigate().to("https://www.t-mobile.com/");
            Thread.sleep(2000);
            //use reusable method to click on element create custom reusable method to click on popup
            //Click on x button
            Reusable_Actions.popUpHandelClick(driver, "//*[@class='phx-modal__close']", "pop up");
            //Now I hover over the plans dropdown
            Reusable_Actions.mouseHover(driver, "//*[@href='/cell-phone-plans?INTNAV=tNav%3APlans']", "Hover over Plans");
            //I want to click on unlimited plans and scroll down to the page
            Reusable_Actions.clickActionLogger(driver, "//*[text()='Unlimited Phone Plans']", logger, "Click on Unlimted plan");
            Thread.sleep(2000);
            Reusable_Actions.scrollWebPage(driver, "scroll(0,900)");
            //Now I want to select the plan I want which is Magenta Max
            Reusable_Actions.clickByIndexActionLogger(driver, "//*[@data-testid='select-phone-plan']", logger, 0, "Click on Magenta Max");
//Now click on continue to the cart
            Reusable_Actions.clickActionLogger(driver, "//*[@data-testid='nplans-line-selector-next']", logger, "Click on continue to the cart");
            //Now scroll down to the bottom of the page
            Thread.sleep(3000);
            Reusable_Actions.scrollWebPage(driver, "scroll(0,1500)");
            Reusable_Actions.clickActionLogger(driver, "//*[@data-testing='device-selector-byod']", logger, "Click on Bring your own device");
            //Now scroll down to phone number
            Thread.sleep(2000);
            Reusable_Actions.scrollWebPage(driver, "scroll(0,600)");
            //Since I am already a T-mobile customer I want to test out my Phone number to see if I can get an error
            Reusable_Actions.clickActionLogger(driver, "//*[@id='phoneNumber']", logger, "Click on search box");
            Reusable_Actions.sendKeysActionLogger(driver, "//*[@id='phoneNumber']", "9175131991", logger, "Click on search box");
            Reusable_Actions.clickActionLogger(driver, "//*[@data-testid='validate-number']", logger, "Click on check this number");
            Thread.sleep(2000);
            String result = Reusable_Actions.getTextActionLogger(driver, "//*[@class='mat-error error-text']", logger, "Already a T-Mobile customer please click here to login");
            //split the result by single space and print out the search number
            String[] arrayResult = result.split(" ");
            System.out.println("Search number is " + arrayResult[1]);
            logger.log(LogStatus.INFO, "Already a T-Mobile customer please click here to login " + arrayResult[1]);
            //string error messege
            reports.endTest(logger);
            //end the logger per test
        }//End test
    @Test(priority = 6)
    public void PayASGuest() throws InterruptedException {
        logger = reports.startTest("Pay As Guest");
        driver.navigate().to("https://www.t-mobile.com/");
        //use reusable method to click on element create custom reusable method to click on popup
        //Click on x button
        Thread.sleep(2000);
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
            driver.close();
            reports.flush();
        }
}//End of Java Class






