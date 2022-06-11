package Day2_04242022;

public class WhileLoop {
    public static void main(String[] args) {
        // iterate through zipcode and its street Number using linear Array and while Loop
        String[] zipCodes = new String[]{"11215" , "11223" , "11204" , "11213"};
    int[] houseNumber  = new int[]{179,209,1720,157};

    //initialize your starting point before calling while loop
    int i=0;
//define the end point in the while loop
        while (i < houseNumber.length) {
            System.out.println("my zipcode is " + zipCodes[i] + " and house number " + houseNumber[i]);
            //incrementing
            i = i +1;
        }//end of While Loop
        } //end of main
    }//end of java class