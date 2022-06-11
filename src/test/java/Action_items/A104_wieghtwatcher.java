package Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class A104_wieghtwatcher {
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
        driver.navigate().to("https://www.weightwatchers.com/us/");
        Thread.sleep(2000);

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11203");
        zipCode.add("11218");
        zipCode.add("11220");
        for (int i = 0; i < zipCode.size(); i++) {


            //2.handle the exception for Find a work shop
            //2.Click on the drop down on the top right of the page cannot use the select method
            try {
                WebElement findaWorkShop = driver.findElement(By.xpath("//*[@data-e2e-name='find_a workshop']"));
                findaWorkShop.click();

            } catch (Exception e) {
                System.out.println("Unable to locate Find a Work Shop Butoon " + e);
            }//end of findaWorkShop button
            try {
                driver.findElements(By.xpath("//*[@class='buttonText-3DCCO']")).get(1).click();
            } catch (Exception e) {
                System.out.println("Unable to click on 'studio' button" + e);
            }//Unable to click on 'studio' button

            try {
                WebElement searchBar = driver.findElement(By.xpath("//*[@class='input input-3TfT5']"));
                searchBar.clear();
                searchBar.sendKeys(zipCode.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter zipCode on the search Bar" + e);
            }//Unable to enter zipCode on the search
            // click on the search arrow on the studio page
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Unable to click on search arrow button" + e);
            }//end  of Unable to click on search arrow button
            //get list of studios, and click on studio link
            //get list of studios, and click on studio link
            try {
                ArrayList<WebElement> searchResults = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'linkContainer-1NkqM']")));
                if (i == 0) {
                    searchResults.get(1).click();
                } else if (i == 1) {
                    searchResults.get(2).click();
                } else if (i == 2) {
                    searchResults.get(0).click();
                }
                System.out.println("Number of Studios found for zipcode: " + searchResults.size());
                Thread.sleep(1000);
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to get list of studios " + e);
            }//end of get list of studios exception


            try {
                driver.findElements(By.xpath("//*[@class = 'linkContainer-1NkqM']")).get(0).click();
            }catch (Exception e) {
                System.out.println("Unable to get list of studios" + e);

            }
            //print out studio address
            try {
                String studioAddress = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                Thread.sleep(1000);
                System.out.println("The address for the studio is "+ studioAddress);
            }catch (Exception e) {
                //print out the exception
                System.out.println("unable to print studio address"+ e);
            }//end of click on search arrow exception

            // scroll to the studio schedule
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,400)");
            }catch (Exception e) {
                // now I print out the exception
                System.out.println("unable to scroll" + e);
            }//end of scroll to the studio schedule exception
            // now we print the studio schedule
            try {
                String studioSchedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                Thread.sleep(1000);
                System.out.println("The schedule for the studio is "+ studioSchedule);
            }catch (Exception e) {
            //print out exception for studio schedule
                System.out.println("Unable to print studio schedule" + e);
            }//end of print studio schedule
                }//end of get list of studios exception
            // quit chrome
            driver.quit();
           }
        }