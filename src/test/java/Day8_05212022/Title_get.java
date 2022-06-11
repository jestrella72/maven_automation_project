package Day8_05212022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Title_get {

    public static void main(String[] args) throws InterruptedException {

        //set up your chromedriver with webdrivermanager
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
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        //driver.manage().window().fullscreen();//or use .window().maximize();
        //go to google homepage
        driver.navigate().to("https:www.google.com");
        // capture the tile of the page and compare it with your expected title 'GOOGLE'
        String actualTitle = driver.getTitle();
        //if(actualTitle.equals("GOOGLE")) {// does not match
        if(actualTitle.equals("Google")) {// now it matches
            System.out.println("My title matches");
        }else{
            System.out.println("Tile doesn't match. Actual Title is "+ actualTitle);
        }
    }//Tile doesn't match. Actual Title is Google it failed
    //how to capure a title of a page  just driver.getTitle
    // how you compare them ? by storing them as a string variable with the name
    //then use if else condition if your expected matches with the actual else it doesn't match














}
