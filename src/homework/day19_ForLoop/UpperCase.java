package homework.day19_ForLoop;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        /*
        Given a String, find and print how many uppercase letter, lowercase letter,
         and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter anything ");
        String word = input.nextLine();
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                countLower++;

            } else if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                countUpper++;


            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                countDigit++;

            }
        }
        System.out.println(countLower + " lowercase letters");
        System.out.println(countUpper + " uppercase letters");
        System.out.println(countDigit + " numbers");
    }
}
