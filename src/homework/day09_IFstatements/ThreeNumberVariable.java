package homework.day09_IFstatements;

import java.util.Scanner;

public class ThreeNumberVariable {
    /*
    Create three number variables
Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the biggest");

        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the biggest");

        } else {
            System.out.println(number3 + " is the biggest");
        }
        input.close();
    }
}
