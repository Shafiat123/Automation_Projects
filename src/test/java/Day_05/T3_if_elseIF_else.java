package Day_05;

public class T3_if_elseIF_else {
    public static void main(String[] args) {
        //lets declare 3 integer numbers
        int a = 5;
        int b = 10;
        int c = 7;

        //using multiple condition to verify when a+b is greater than c, when a+b is equal to c, and when a+b is less than c
        if (a + b > c) {
            System.out.println("The sum of a and b is greater than c");
        } else if (a + b == c) {
            System.out.println("The sum of a and b is equal to c");
        } else {
            System.out.println("The sum of a and b is less than c");
        }
    }//end of main
}//end of class
