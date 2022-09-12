package day10_if_statesments;

import java.util.Scanner;

public class FizzBuzz {
    /*
    [IQ] - common interview question
    [IQ] - Given a number n print the the output based on the following conditions:

    the number if divisible by 3 print Fizz
    the number if divisible by 5 print Buzz
    the number if divisible by 3 and 5 print FizzBuzz
    if the number is not divisible by any the print just the number

    Ex:
    n = 10
    Buzz

    n = 12
    Fizz

    n = 13
    13

    n = 15
  fizzbuss

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("fizzBuzz");
        }else if (number % 5 == 0) {
            System.out.println("buzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(number);
        }

    scan.close();

    }
}
