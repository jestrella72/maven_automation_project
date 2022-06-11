package Day10_05282022;

import ResuableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ForLoop_tesNG_examples {
    //declare the local driver outside so that It can be reusable with other annotation methods.
    WebDriver driver;
            //before the suite will set the driver you are using

        @BeforeSuite
        public void SetChromeDriver() {
            driver = Reusable_Actions.setDriver();
        }//End of before suite Annotation
    //test case 1: navigate to google and enter a keyword on search field
            @Test
            public void SearchForKeyword(){

        ArrayList<String> cars = new ArrayList();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

                for (int i = 0; i < cars.size(); i++) {
                    driver.navigate().to("https://www.google.com");
                    //enter a keyword on search field
        Reusable_Actions.sendKeysAction(driver, "//*[@name='q']",cars.get(i), "Search Field");
                    //submit the go
        Reusable_Actions.submitAction(driver,"//*[@name='btnk']","search Field");
        //capture search result
        String result = Reusable_Actions.getTextAction(driver,"//*[@id='result-stats']","Search Field");
        //split the result by single space and print out the search number
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for " + cars.get(i)+"is"+ arrayResult[1]);
                }//end of for loop
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite
}
