package Day2_04242022;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        //create an ArrayList for cities and Loop /iterating all the values using for loop
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Long Island");
        for (int i = 0 ; i < cities.size(); i++ ){
            System.out.println("my city is " + cities.get(i));
        }// end of For Loop
        } //end of main
    }//end of java class
