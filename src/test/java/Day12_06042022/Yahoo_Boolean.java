package Day12_06042022;

import ResuableLibraries.Reusable_Actions;
import Reusable_Classes.Reusable_Annotation_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Yahoo_Boolean extends Reusable_Annotation_Class {
    @Test
    public void YahooStaySignIn() {
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on Sign in
        Reusable_Actions.clickAction(driver, "//*[text()='Sign in']", "Sign In");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
        // state of element means if it is true or flase
        System.out.println("Is element checked? " + elementState);
    }//end of test

    @Test(priority = 2)
    public void NavigateToYahooHome() {
        //navigate to yahoo
      //  logger.log(LogStatus.INFO, "Navigating to Home page");
        driver.navigate().to("https://www.yahoo.com");

    }//end of test 2
}