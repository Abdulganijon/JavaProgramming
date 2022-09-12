package homework.day19_ForLoop;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = input.nextLine();
        String wordWithSpace = "";

        for (int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i)==' '){
                word1 = word1.replace(" ", "_");
            }
            wordWithSpace += word1.charAt(i) + " ";

        }
        System.out.println(wordWithSpace);

        }

    }


