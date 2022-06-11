package Day7_05152022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Select_Mortgagecal {
    public static void main(String[] args) throws InterruptedException {
        //set up your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //set chorme options argument
        ChromeOptions options = new ChromeOptions();
        //set the condition to maximize/fullscreen your driver
        options.addArguments("incognito");
        //set the condition to maximize/ fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless (running on background)
        //options.addArgument("headless");
        //for mac use full screen
        //options.addArgument("start-fullscreen");
        //define the webdriver i am going to use
        //navigate to the mortgagaecalculator site
        WebDriver driver = new ChromeDriver(options);
        //navigator to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);
        //select start month from the dropdown
       WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
       Select dropDown = new Select(startMonth);
        // I want to select by visble text
        dropDown.selectByVisibleText("Jun");
        //Now I want to select using loans
        WebElement loanType = driver.findElement(By.xpath("//*[@name='param[milserve]']"));

        Select loanTypeDropdown = new Select(loanType);

        loanTypeDropdown.selectByVisibleText("FHA");
        //another example if dropdown start date but not on select tag but under div
        // you have to click on the dropdown first and then click on the vaule on the drop down.

    }//end of main
}// end of java class

