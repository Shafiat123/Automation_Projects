package Day_03;

import java.util.ArrayList;

public class Topic02_Loop_while {
    public static void main(String[] args) {
        //create a liner array of countries
        String[] countries = new String[] {"USA", "Bangladesh", "Mexico", "Canada"};

        //loop through the entire linear array and print out each value
        int i = 0;
        while(i < countries.length){
            System.out.println("Country is: " + countries[i]);
i++; //same as i = i+1;

        }//end of loop
    }// end of main
}//end of class
