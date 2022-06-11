package Reusable_Classes;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Action_Logger {
//resuable function for webdriver as a return method
    public static WebDriver setDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //for mac use full screen
        //options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }//end of setDriver method

        public static int timeout = 30;

        public static void submitActionLogger(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
                WebDriverWait wait = new WebDriverWait(driver, timeout);
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                    element.submit();
                    logger.log(LogStatus.PASS, "Successfully submit on element " + elementName);
                } catch (Exception e) {
                    System.out.println("Unable to submit on element " + elementName + " " + e);
                    logger.log(LogStatus.FAIL, "Unable to submit on element " + elementName + " " + e);
                }
            }//end of submit


            //create a sendkeys Logger method
            public static void sendKeysActionLogger(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
                WebDriverWait wait = new WebDriverWait(driver, timeout);
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                    element.click();
                    element.clear();
                    element.sendKeys(userValue);
                    logger.log(LogStatus.PASS, "Successfully enter user value on element " + elementName);
                } catch (Exception e) {
                    System.out.println("Unable to click on element " + elementName + " " + e);
                    logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + " " + e);
                }
            }//end of sendkeys method

            //create a getText Logger method
            public static String getTextActionLogger(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
                WebDriverWait wait = new WebDriverWait(driver, timeout);
                String result = null;
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                    result = element.getText();
                    logger.log(LogStatus.PASS, "Successfully capture text on element " + elementName);
                } catch (Exception e) {
                    System.out.println("Unable to capture text on element " + elementName + " " + e);
                    logger.log(LogStatus.FAIL, "Unable to capture text on element " + elementName + " " + e);
                }
                return result;
            }//end of getTextAction method

            //create a click method
            public static void clickActionLogger(WebDriver driver, String xpath,ExtentTest logger, String elementName) {
                WebDriverWait wait = new WebDriverWait(driver, timeout);
                logger.log(LogStatus.PASS, "Successfully able to click on element " + elementName);
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                    element.click();
                } catch (Exception e) {
                    System.out.println("Unable to click on element " + elementName + " " + e);
                    logger.log(LogStatus.FAIL, "Unable to Click on element " + elementName + " " + e);

                }
            }//end of clickAction
        public static void verifyStatusOfElement(WebDriver driver, String xpath, Boolean expectedStatus, ExtentTest logger, String ElementName){
            WebDriverWait wait = new WebDriverWait(driver,10);
            try{
                Boolean actualStatus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
                if(expectedStatus == actualStatus){
                    logger.log(LogStatus.PASS,"Element is selected as expected");
                } else {
                    logger.log(LogStatus.FAIL,"Element is not selected");
                }
            } catch (Exception e) {

            }

        }//end of method


    }


