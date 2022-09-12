package homework.day14.String;

import java.util.Locale;
import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {

    /*
    Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

input.close();
    }
}
