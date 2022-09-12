package homework.day32_ArrayList;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class HidePasswordsHW2 {
    public static void main(String[] args) {
        /*
        Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format
where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]

         */

        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> result = new ArrayList<>();
        for (String each : password) {

            for(int i=0;i<each.length();i++){
                each=each.replace(each.charAt(i),'*');
            }
            result.add(each);
        }
        System.out.println(result);
    }
}
