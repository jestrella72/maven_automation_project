package Day12_06042022;

import ResuableLibraries.Reusable_Actions;
import Reusable_Classes.Reusable_Annotation_Class;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class GoogleSearch_Annotation_Reusable extends Reusable_Annotation_Class {

    @Test(priority = 1)
    public void GoogleSearchForKeyword(){
        logger = reports.startTest("Search for a keyword");
        driver.navigate().to("https://www.google.com");
        //enter a keyword on search field
        Reusable_Actions.sendKeysActionLogger(driver,"//*[@name='q']","BMW",logger,"Search Field");
        //submit the go button
        Reusable_Actions.submitActionLogger(driver,"//*[@name='btnK']",logger,"Google Search Button");

        //end the logger per test
        reports.endTest(logger);
    }//end of test 1

    /*
    dependsOnMethods is used when  following @Test is dependent on previous @Test method. If the first test fails,
    the dependent test will get skipped
     */
    @Test(dependsOnMethods = "GoogleSearchForKeyword")
    public void CaptureSearchNumber(){
        logger = reports.startTest("Capture the search number");
        //capture search result
        String result = Reusable_Actions.getTextActionLogger(driver,"//*[@id='Result-stats']",logger,"Search Result Text");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number is " + arrayResult[1]);

        reports.endTest(logger);
    }//end of test 2




}
