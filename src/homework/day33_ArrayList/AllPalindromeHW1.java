package homework.day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindromeHW1 {
    public static void main(String[] args) {
        /*
        All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        ArrayList<String> allPalindrome = new ArrayList<>();


        for (String each : words) {
            String result = "";
            for(int i=each.length()-1; i>=0;i--){
                result += each.charAt(i);
            }if(result.equalsIgnoreCase(each)){
                allPalindrome.add(each);
            }

        }
        System.out.println(allPalindrome);


    }
}
