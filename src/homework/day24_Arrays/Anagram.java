package homework.day24_Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        [IQ] Given two Strings determine if they are anagram or not.
        Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent

The letters of the two words are the same so they are anagram
         */
        String word1 = "listen";
        String word2 = "silent";
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) { //every char
                count++;
            }
        }
        if (count == array2.length) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }}

