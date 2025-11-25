package Action_items;

public class Assignment_02 {
    public static void main(String[] args) {
        //creating a region array which contains 3 value
        String[] region = new String[] {"USA", "Korea", "China"};
        //creating a area code array which contains 3 value
        int[] areaCode = new int[] {102, 103, 104};


        //printing the first and last value of region
        System.out.println("First value of region would be " + region[0] + " and the last region would be " + region[2]);
        //printing second and third value of int
        System.out.println("The second area code of is " + areaCode[1] + " and the third area code is " + areaCode[2]);

        //printing out the size of region list
        System.out.println("The size of region list: " + region.length);

    }// end of main
}// end of class
