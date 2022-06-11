package Day7_05152022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class FedilisCare_Tabs {
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
        driver.navigate().to("https://www.fideliscare.org/");
        Thread.sleep(3000);
        //looks like there is not alot of unique property so we are going to use text
        //we going to use findElements so contains
        // shop for a plan
        //we are clicking on index 0 because there are two elements for this xpath
        driver.findElements(By.xpath("//*[text()='Shop For a Plan']")).get(0).click();
        //Wait for the page to load
        Thread.sleep(2000);
        //now I click on medicad manage care and copy and paste
        driver.findElements(By.xpath("//*[text()='Medicaid Managed Care']")).get(0).click();
        Thread.sleep(3000);
        //we doing unit testing- we are checking pieces by pieces if we find a error
        //next we need to open a new tab to find a doctor search button index 1
        //I found a unique element //*[@href='/findadoctor'] so we using driver.Findelement not elements
        //click on search under find a doctor card
        // we dont use .get on on findElement
        driver.findElement(By.xpath("//*[@href='/findadoctor']")).click();
        Thread.sleep(3000);

        //Store new tabs in a array list
          ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tabs , it should be at index 1
        driver.switchTo().window(tabs.get(1));
        //without this statement driver.switchTo().window(tabs.get(1));
        // as you see at default selenium does not know and won't be able  to click on button
        //click on new search button
        driver.findElement(By.xpath("//*[@class='fal fa-search-plus']")).click();
        //we don't use @ symbol for contains and text
        Thread.sleep(3000);
        //close new tab
        driver.close();
        //swtich back to the default tab
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.xpath("//*[@class='fal fa-stethoscope fa-fw']")).click();
        //wait until provider card is clicked on
        Thread.sleep(2000);

        //Then click on providers card


    }
}



