package Day3_04302022;

public class Multiple_Conditional_Statements {

    public static void main(String[] args) {
        //if a+b is less than c then print the result
        // if a+b is greater than c print the result
        // finally print a+b is equal to c
     int a = 1;
     int b = 2;
     int c = 3;
 if(a+b < c){
     System.out.println( " a & b is less than c ");
 }else if(a+b > c){
     System.out.println( " a & b is greater than c ");
 }else {
     System.out.println( " a & b is equal to c ");

     // declare additional variables
     int d = 4;
     int e = 5;
     int f = 6;
     // or operator with if statement
     // || is used for or operator -- one of the condition need to be true only
     // && is used for nd operator  -- both conditions needs to be true
     if (d < e && f < e) {
         System.out.println("d is less than e or f is less then e");
     } else {
         System.out.println("condition is not true");
     }
 }//end of condition
 }//end of main
}//end of java class