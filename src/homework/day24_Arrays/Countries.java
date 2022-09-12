package homework.day24_Arrays;

import java.util.Arrays;

public class Countries {
    public static void main(String[] args) {
        /*
        Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
         */
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam","Albania", "Portugal", "Philippines",
                "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        for(String each : countries){
            System.out.println(each.charAt(0) + "" + each.charAt(each.length()-1));
            System.out.println("" + each.charAt((each.length()-1)/2));
            System.out.println(Arrays.toString(each.toCharArray()));
        }


    }
}
