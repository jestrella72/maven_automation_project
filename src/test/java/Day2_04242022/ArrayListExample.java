package Day2_04242022;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); //this is index 0
        countries.add("France"); //this is index 1
        countries.add("India");
        countries.add("Canada");
        countries.add("Pakistan");
        //I want to print 4th value from the list
        System.out.println(" My country is " + countries.get(3));

    } //end of main
}//end of java class
