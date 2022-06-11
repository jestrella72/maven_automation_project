package Day11_05292022;

import ResuableLibraries.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Boolean_with_checkbox {
    WebDriver driver;

    @BeforeSuite
    public void setChromeDriver() {
        driver = Reusable_Actions.setDriver();
        }//end of the before suite

            @Test
    public void YahooStaySignIn(){
        //navigate to usps
        driver.navigate().to("https://www.yahoo.com");
        //click on Sign in
        Reusable_Actions.clickAction(driver,"//*[text()='Sign in']","Sign In");
        //verify the stay signed in checkbox is selected or not
        WebDriverWait wait = new WebDriverWait(driver,10);
        Boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))).isSelected();
       // state of element means if it is true or flase
        System.out.println("Is element checked? " + elementState);
    }//end of test

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite



}
