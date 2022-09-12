package homework.day17_loop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */
        Scanner input = new Scanner(System.in);
        int num=0;
        int sum=0;

        while(num >=0){
            num = input.nextInt();
            if(num >=0){
                sum += num;

            }
        }
        System.out.println("" + sum);
    }
}
