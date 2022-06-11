package Action_items;

public class A102_ConditionalStatement {

    public static void main(String[] args) {
        //the first condition --When grade range is from 90 to 100 print grade as A
        //the second condition--When grade range is from 80 to 89 print grade as B
        //the third condition-- When grade range is from 70 to 79 print grade as C
        //the fourth condition--When grade range is from 60 to 69 print grade as D
        //the Last condition-- When grade range is below 60 is it a F
        int grade = 85;
        if(grade >= 90 && grade <= 100){
            System.out.println( "When grade range is from 90 to 100 print grade as A ");
        } else if(grade >= 80 && grade < 90){
            System.out.println( "When grade range is from 80 to 89 print grade as B ");
        } else if(grade >= 70 && grade < 80){
            System.out.println( "When grade range is from 70 to 79 print grade as C ");
        } else if(grade >= 60 && grade < 70) {
            System.out.println("When grade range is from 60 to 69 print grade as D ");
        } else {
            System.out.println("When grade range is below 60 is it a F");
        }//end of conditions
    }//end of main
}//end of java class
