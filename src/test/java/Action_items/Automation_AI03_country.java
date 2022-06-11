package Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.text.html.Option;
import java.util.ArrayList;


public class Automation_AI03_country {
    public static void main(String[] args) throws InterruptedException {
        //set up your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //Now set chrome options argument
        ChromeOptions options = new ChromeOptions();
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
        ArrayList<String>NbaTeams = new ArrayList<>();
        NbaTeams.add("Nets");
        NbaTeams.add("Celtics");
        NbaTeams.add("Spurs");
        NbaTeams.add("Lakers");
        NbaTeams.add("Heats");
        for (int i = 0; i < NbaTeams.size();i++) {
            driver.navigate().to("https://www.bing.com/");
            Thread.sleep(3000);
            //locate element for search field and type keyword 'NBATEAMS'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(NbaTeams.get(i));
            //submit on google search button
            driver.findElement(By.xpath("//*[@stroke-linecap='round']")).submit();
            Thread.sleep(2000);
            //capture the google search and print it
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
           // String replaceParanth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My search number for My Nba Team " + NbaTeams.get(i) + " is " + arrayResult[0]);
        }//end for loop
        //quit the driver
        driver.quit();
    }//end of main
}// end of java class


