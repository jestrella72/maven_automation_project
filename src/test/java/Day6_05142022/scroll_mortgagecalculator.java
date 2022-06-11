package Day6_05142022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
public class scroll_mortgagecalculator {

    public static void main(String[] args) throws InterruptedException {
        //set up your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //set chorme options argument
        ChromeOptions options  = new ChromeOptions();
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
        driver.navigate().to("https://www.mortgagecalculator.org/");
        Thread.sleep(3000);
        //declare java script executor variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll to pixel 400 mortgage calc website
        // jse.executescript ("scroll(0,800)");
        //wait a bit for the broswer to perform scrolling
        //Thread.sleep(3000);
        // declare an web element variable that we want to scroll into
        WebElement shareButton = driver.findElement(By.xpath("//*[@id='share_button']"));
      //  scroll in to share this calculation button

        jse.executeScript("arguments[0].scrollIntoView(true):",shareButton);
        Thread.sleep(2000);
        // click on the share this calculation button

        shareButton.click();
        Thread.sleep(2000);
        //scroll back up

        jse.executeScript("scroll(0,-400)");
        Thread.sleep(2000);
        //Quit the chrome driver
        driver.quit();
    }//end of main
}// end of java class





