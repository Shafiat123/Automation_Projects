package Day_03;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic01_For_loop {
    public static void main(String[] args) {

        //create an arrayList of cities
        ArrayList<String> city = new ArrayList<>();
        city.add("Cheektowaga");
        city.add("Lockport");
        city.add("Orchard ParK");
        city.add("Depew");

        //iterate through the entire list of cities and print out each one

            for (int i = 0; i < city.size(); i++) {
                System.out.println("City is " + city.get(i));

        }//end of loop

    }// end of main
} //end of class
