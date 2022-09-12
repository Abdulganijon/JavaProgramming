package homework.day31_ArrayList;

import java.util.ArrayList;

public class TryToLoop4 {
    public static void main(String[] args) {
        /*
        Try to loop:

Create an ArrayList of Characters
Fill the ArrayList with letters from a-z
Print the ArrayList of all the characters

Manually remove each vowels and print the new ArrayList
         */
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            letters.add((char)(i));
        }
        System.out.println(letters);

        letters.remove((Character)'a');
        letters.remove((Character)'i');
        letters.remove((Character)'o');
        letters.remove((Character)'u');
        letters.remove((Character)'y');
        System.out.println(letters);


    }
}
