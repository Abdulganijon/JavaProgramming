package homework.day17_loop;

import java.util.Scanner;

public class LoopFactorialNumber {
    public static void main(String[] args) {
        /*
        write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int factorialNumber = 1;

        while(number>=1){

            factorialNumber *= number;
            number--;
            /*
            int num = new Scanner(System.in).nextLine();
            int factorial =1;
            String msg = num + "! = ";

            for(int i = num; i>1; i--){
            factorial *=i;
            msg +=i + " * ";
            }
            msg+= "1 = " + factorialNumber;
            System.out.println(factorial);
            System.out.println(msg)
             */

        }
        System.out.println("Factorial number: " + factorialNumber);

    }

}
