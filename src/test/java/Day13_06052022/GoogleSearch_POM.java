package Day13_06052022;

import Object_Model.BaseClass;
import Reusable_Classes.Reusable_Annotation_Class;
import org.testng.annotations.Test;

public class GoogleSearch_POM extends Reusable_Annotation_Class {

    @Test
    public void SearchForAKeywordOnGoogleHome(){
        driver.navigate().to("https://www.google.com");
        BaseClass.googleHomePage().searchUserValue("BMW");
        BaseClass.googleHomePage().submitOnGoogleSearch();
    }

    @Test(dependsOnMethods = "SearchForAKeywordOnGoogleHome")
    public void CaptureSearchNumberFromGoogle(){
        BaseClass.googleSearchResultPage().CaptureSearchNumberAndPrintIt();
    }


}


