package homework.day32_ArrayList;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class SeperateParts {
    public static void main(String[] args) {
        /*
        Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
output:
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> specChars = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                nums.add(str.charAt(i));
            } else if (Character.isUpperCase(str.charAt(i))) {
                letters.add(str.charAt(i));
            } else {
                specChars.add(str.charAt(i));
            }
        }
        System.out.println(specChars);
        System.out.println(nums);
        System.out.println(letters);
    }
}
