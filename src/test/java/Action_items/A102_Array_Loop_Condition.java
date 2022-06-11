package Action_items;

import java.util.ArrayList;

public class A102_Array_Loop_Condition {
    public static void main(String[] args) {
        //create an array with Cities and print only when cities is Brooklyn or Manhattan
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");
        cities.add("Staten");
        for (int i = 0; i < cities.size(); i++) {
            // with if condition and else if condition
            if (cities.get(i) == "Brooklyn") {
                System.out.println("My city is " + cities.get(i));
            } else if (cities.get(i) == "Manhattan") {
                System.out.println("My City is " + cities.get(i));
            }

            //with or operator both conditions has to be true for me to print Brooklyn or Manhattan

            if (cities.get(i) == "Brooklyn" || cities.get(i) == "Manhattan") {
                System.out.println("My city is " + cities.get(i));
            }
        }//end of for loop
    }// end of main
}// end of java class