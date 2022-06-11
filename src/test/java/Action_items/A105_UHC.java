package Action_items;

import ResuableLibraries.Reusable_Actions;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class A105_UHC {
    public static void main(String[] args) {
        //setting the local driver to resuable setdriver
        WebDriver driver = Reusable_Actions.setDriver();
        //Fist Name Array List
        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Jeffrey");
        firstNames.add("Jeremy");
        firstNames.add("Jason");
        //last Name ArrayList
        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Estrella");
        lastNames.add("James");
        lastNames.add("Moon");
        //birth Month ArrayList
        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("August");
        birthMonth.add("June");
        birthMonth.add("July");
        ArrayList<String> birthDay = new ArrayList<>();
        birthMonth.add("19");
        birthMonth.add("20");
        birthMonth.add("21");
        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1994");
        birthYear.add("1995");
        birthYear.add("1996");
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11203");
        zipCode.add("11218");
        zipCode.add("11201");
        ArrayList<String> memberID = new ArrayList<>();
        memberID.add("1300");
        memberID.add("1375");
        memberID.add("1200");

        // start for loop
        for (int i = 0; i < firstNames.size(); i++) {

        //navigate to UHC.com
        driver.navigate().to("https://www.UHC.com");
//verify the hompage title contains health insurance
        Reusable_Actions.verifyTitle(driver, "Health insurance plans");
        // To find a doctor link
        Reusable_Actions.clickAction(driver, "//*[@aria-label='Find a doctor']", "To Find a doctor");
        //Click on 'Sign in'
        Reusable_Actions.clickAction(driver, "//*[@aria-label='Sign in menu']", "Sign In");
        //Click on 'Medicare Plan'
        Reusable_Actions.clickAction(driver, "//*[text()='Medicare plan?']", "Medicare Plan");
        //Switch to new Tab
        Reusable_Actions.switchToTabByIndexAction(driver,1,"Switch to second tab");
    // Now we use scroll method after switching tabs
        Reusable_Actions.scrollWebPage(driver,"Scroll","0,500");
        //Click on Register Now
        Reusable_Actions.clickAction(driver, "//*[@class='uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Reistering Now Button");
       //start entering the search field by send keys
        //Reusable_Actions.sendKeysAction(driver, "////*[@name='firstName']", "firstNames.get(i)", "First Name field");
    //Now we enter first name,Last name, DOB Month, DOB YEAR,ZipCode, MemberID
        Reusable_Actions.sendKeysAction(driver, "//*[@id='firstName']", firstNames.get(i), "first name");
        Reusable_Actions.sendKeysAction(driver,"//*[@id='lastName']", lastNames.get(i), "last name");
        Reusable_Actions.sendKeysAction(driver,"//*[@id='dob_month_input']",birthMonth.get(i),"Birth month dropdown");
            Reusable_Actions.sendKeysAction(driver,"//*[@id='dob_year']",birthYear.get(i),"Birth Year");
           // Reusable_Actions.sendKeysAction(driver,"//*[@id='dob_day']",birthDay.get(i),"Birth day");
       Reusable_Actions.sendKeysAction(driver, "//*[@id='zipCode']",zipCode.get(i), "zip code");
       Reusable_Actions.sendKeysAction(driver,"//*[@id='memberId']",memberID.get(i),"MemberID");
            //Switch Back to Main Tab
            Reusable_Actions.switchToTabByIndexAction(driver,0,"switch to tab 0");

        //   Reusable_Actions.switchToTabByIndex(driver, 0);
    }//End of for loop
        //Close driver
        driver.quit();
    }//End of java class
}//End of Main Method

