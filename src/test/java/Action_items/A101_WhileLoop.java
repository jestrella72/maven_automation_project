package Action_items;

public class A101_WhileLoop {
    public static void main(String[] args) {
        // // iterate through region and its area code using linear Array and while Loop
   String[] region = new String[]{"Africa", "Asia", "Caribbean", "Europe"};
   int[] areaCode = new int[]{718,347,1809,222};
   // initialize your starting point before calling while Loop
        int i = 0;
   // define the end point in the while Loop
   while (i < areaCode.length){
        System.out.println(" My region is " + region[i] + " My area code is " + areaCode[i]);
        //incrementing
        i = i +1;
    }//end of While Loop
    } //end of main
}//end of java class