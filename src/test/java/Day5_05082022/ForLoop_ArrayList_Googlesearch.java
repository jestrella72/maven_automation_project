package Day5_05082022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ForLoop_ArrayList_Googlesearch {
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
        //maximize the driver
        //driver.manage().window().fullscreen();//or use .window().maximize();

        ArrayList<String>cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queen");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Long Island");
    for (int i = 0; i < cities.size();i++) {
        driver.navigate().to("https:www.google.com");
        Thread.sleep(3000);
        //locate element for search field and type keyword 'Countries' looking for the tag name
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities.get(i));
        //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(2500);
        //capture the google search and print it
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Result is " + searchResult);
        //extract out the number and print the search number only
        String[] arrayResult = searchResult.split(" ");
        System.out.println("My search number for the city " + cities.get(i) + " is " + arrayResult[0]);
        //quit the driver
       // driver.quit();
    }//end for loop
    }//end of main
}// end of java class













