package Action_items;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//I want to be able to get a notification on my phone when create and sign in with an account with my person info
public class A106_Tmobile_Sign_In {
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
    public void ClickOnMyAccount(){
        logger = reports.startTest("SignIn to Verify my Account");
        driver.navigate().to("https://www.t-mobile.com/");
        //use reusable method to click on element create custom reusable method to click on popup
        //Click on x button
        Reusable_Actions.popUpHandelClick(driver,"//*[@class='phx-modal__close']","pop up");
        //Click on the My Account DropDown button
      Reusable_Actions.clickActionLogger(driver,"//*[@class='unav-account']",logger,"Click on Drop Down");
        Reusable_Actions.clickActionLogger(driver,"//*[@class='phx-button unav-account__action unav-account__action--login']",logger,"Click on Log In");
      //end the logger per test
        reports.endTest(logger);
    }//end of test 1
    @Test
    public void SignUp() throws InterruptedException {
            logger = reports.startTest("Scroll down");
            //scroll down to the page
        Reusable_Actions.scrollWebPage(driver,"600");
        //Click on sign up
        Reusable_Actions.clickActionLogger(driver,"//*[@id='lp1-signup-btn']",logger,"Click on Sign In");
        //Now we type in the phone number
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@id='usernameTextBox']","9175131991",logger,"Type In phone number");
        Thread.sleep(3000);
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@id='enterPhoneNumberTextBox']","9175131991",logger,"Type In phone number");
        //Now we Click on next Button
       Reusable_Actions.clickActionLogger(driver,"//*[@id='epn-submit-btn']",logger,"Click on Next Button");
        reports.endTest(logger);
    }//Finished Clicking on Next
    @Test
    public void TMoblieID() throws InterruptedException {
        //Now I type in my first name,Last name,Email,& password
        logger = reports.startTest("Sign in My Info");
        Reusable_Actions.clickActionLogger(driver,"//*[@name='firstName']",logger,"Click on search box");
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@name='firstName']","Jeffrey",logger,"Type In First Name");
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@name='lastName']","Estrella",logger,"Type In Last Name");
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@name='Email']","Jestrella72@gmail.com",logger,"Type In Email");
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@name='password']","Drmaster12",logger,"Type In password");
    //Now create T-mobile ID
        Thread.sleep(3000);
        Reusable_Actions.clickActionLogger(driver,"//*[@type='button']",logger,"Click on create T-mobile ID");
        Reusable_Actions.clickActionLogger(driver,"//*[@class='arrow fa fa-angle-right']",logger,"Click on create T-mobile ID");
// just in case use contains //span[contains(text(),'Create T-Mobile ID')]
        //Now get a text verifying it you
        reports.endTest(logger);

    }

    @AfterSuite
    public void quitSession() {
      // driver.quit();
       //reports.flush();
    }
    }//end of after suite


//I want to be able to create an account with t-mobile