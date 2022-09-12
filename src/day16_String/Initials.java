package day16_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println("First name + ");



    }
}
