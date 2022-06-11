package Day9_05222022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UPS_Implicit_wait_vs_Explicit {

    public static void main(String[] args) throws InterruptedException {

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
    //set your global implicit wait
     //   driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://www.usps.com");
        // call on mouse actions
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,8);
        //hover to quick tools
        //WebElement quicktools = driver.findElement(By.xpath("//*[text() ='Quick Tools']"));
        WebElement quicktools = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() ='Quick Tools']")));
        actions.moveToElement(quicktools).perform();
        //click on track package
        //driver.findElement(By.xpath("//*[text()='Track a Package']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        //click and then type on track a package field because its a text area field !
        //declare and define explicit
        //WebElement packageField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        WebElement packageField =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tracking-input']")));
        packageField.click();
        packageField.sendKeys("23333456");
        //hover to quick tools
}








}
