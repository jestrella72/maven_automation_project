package Day6_05142022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FingElementsExample {

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
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.bing.com/");
        Thread.sleep(3000);
        //Click on the images using class property with index of 1
        //to ignore white spaces in the property vaule we can use the contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();
        // you can also use driver.findElement(By.xpath("//ul[@class='scopes']")); you doing one to one matching
    }//end of main
}// end of java class


