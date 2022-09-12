package homework.day19_ForLoop;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        /*
        Multiply End

Given a String and a number return a String that has the ending character duplicated
and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word and #");
        String word = input.nextLine();
        int number = input.nextInt();
        String output = "";

        for (int i = 0; i < number ; i++) {
            output += word.charAt(word.length()-1) + "";

        }
        System.out.println(word + output);
    }

}
