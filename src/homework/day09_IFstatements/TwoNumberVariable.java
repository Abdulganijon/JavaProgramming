package homework.day09_IFstatements;

import java.util.Scanner;

public class TwoNumberVariable {
    /*
    Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number1 > number2) {
            System.out.println(number1 + " is bigger");
        }else {
            System.out.println(number2 + " is bigger");
        }
        input.close();
    }
}
