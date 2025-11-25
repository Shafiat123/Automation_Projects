package Day_02;

import java.util.ArrayList;

public class T3_ArrayList {
    public static void main(String[] args) {

        ArrayList <String> countries = new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("China");

        System.out.println("The first country is " + countries.get(0) + " and the last one is " + countries.get(2));

        countries.add("Mexico");

        System.out.println("The first country is " + countries.get(0) + " and the last one is " + countries.get(3));

    }// end of main
} // End of class
