package homework.day15_String;

import java.util.Scanner;

public class FirstLastName {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name");
        String first = input.next().toUpperCase();

        System.out.println("Please enter last name");
        String last = input.next().toUpperCase();

        System.out.println(first.charAt(0) + "" + last.charAt(0));


    }
}
