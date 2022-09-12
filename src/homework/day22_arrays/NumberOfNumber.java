package homework.day22_arrays;


import java.util.Arrays;
import java.util.Scanner;

public class NumberOfNumber {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number and print the number as a word.
         Set a range from 0 - 15 and any number not in the range should get an invalid number message
    Ex:
> 1
        one

> 10
        ten
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        String word[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};
             if(num>=1 && num<=15){
                 System.out.println(word[num-1]);
             }else{
                 System.err.println("invalid number. Please enter number from 1-15");
             }
    }
}
