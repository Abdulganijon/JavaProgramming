package homework.day14.String;

import org.w3c.dom.ls.LSOutput;

public class UpperLowerCase {
    public static void main(String[] args) {
/*
    Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format
     */
        String word = "I love Java";

        word = word.toUpperCase();
        System.out.println(word);
        word = word.toLowerCase();
        System.out.println(word);

    }

}
