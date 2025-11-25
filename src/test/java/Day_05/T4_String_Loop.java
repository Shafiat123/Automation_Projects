package Day_05;

public class T4_String_Loop {
    public static void main(String[] args) {

        //create two String arrays
        String[] cities = new String[] {"New York", "Los Angeles", "Chicago", "Houston"};

        //using else and else if condition to print different messages based on the city names
        for(int i = 0; i < cities.length; i++) {
            if (cities[i].equals("New York")) {
                System.out.println(cities[i] + " is known as the Big Apple.");
            } else if (cities[i].equals("Los Angeles")) {
                System.out.println(cities[i] + " is known for Hollywood.");
            } else if (cities[i].equals("Chicago")) {
                System.out.println(cities[i] + " is known as the Windy City.");
            } else {
                System.out.println(cities[i] + " is a major city in the USA.");
            }
        }
    }//end of main
}//end of class
