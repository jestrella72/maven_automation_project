package Action_items;

import java.util.ArrayList;

public class A101_ForLoop {
    public static void main(String[] args) {
      //create an ArrayList for cities and Loop /iterating all the values using for loop
        ArrayList<String> countries = new ArrayList<>();
        countries.add("France");// Index 0
        countries.add("Dominican Republic");// Index 1
        countries.add("Spain");// Index 2
        countries.add("India");// Index 3
        for (int i = 0 ; i < countries.size(); i++ ){
            ArrayList<Integer> countryCode = new ArrayList<>();
            countryCode.add(111);// Index 0
            countryCode.add(222);// Index 1
            countryCode.add(333);// Index 2
            countryCode.add(444);// Index 3
            System.out.println("my country is " + countries.get(i) + " and my country code is " + countryCode.get(i));
            //this for loop iterates through the area code and region and prints the values to the console.
        }// end of For Loop
         } //end of main
}//end of java class


