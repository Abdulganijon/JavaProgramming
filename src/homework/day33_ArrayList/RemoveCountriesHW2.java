package homework.day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountriesHW2 {
    public static void main(String[] args) {
        /*
        Remove Countries

Create a method that will take an ArrayList of countries and returns an ArrayList of countries
that have a length of less than 7

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers

Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        for(int i = 0; i < words.size();i++){
            if(words.get(i).length()>7){
                words.remove(i);
                i--;

               // countries.removeIf(str->str.length()>7);
            }

        }
        System.out.println(words);
    }
}
