package Day_02;

import java.util.ArrayList;

public class T4_ArrayList_Integer {
    public static void main(String[] args) {

        //declare the integer area code array list
        ArrayList <Integer> areacode = new ArrayList<>();
        areacode.add(202);
        areacode.add(233);
        areacode.add(999);
        areacode.add(254);

        System.out.println("The first area code is " + areacode.get(0) + " and the last areacode is " + areacode.get(3));




    }// end of main


}//end of class
