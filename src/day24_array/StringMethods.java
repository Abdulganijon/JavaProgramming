package day24_array;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(letters); // String uses array internally, so it prints as String
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length()); // counts the number of characters
        System.out.println(letters.length);// counts the number of elements

        System.out.println(letters[0]);
    }
}
