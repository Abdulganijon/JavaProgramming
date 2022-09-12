package day41_exceptions.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("enter number 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();
            System.out.println(num1 + num2);

        }catch (InputMismatchException e){
            System.out.println("Need to type numbers inputs");
        }finally{
            System.out.println("Finally Run");
            input.close(); // closes the Scanner object
        }

    }
}