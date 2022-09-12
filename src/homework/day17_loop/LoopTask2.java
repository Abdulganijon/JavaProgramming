package homework.day17_loop;

import java.util.Scanner;

public class LoopTask2 {
    public static void main(String[] args) {
      /*
    write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers ");
        int countNumber = 0;
        int countNegative = 0;
        int countPositive = 0;

        while(countNumber<5){
            int enteredNumber = scanner.nextInt();
            countNumber++;
            if(enteredNumber>=0){
                countPositive++;
            }else{
                countNegative++;
            }
        }

        System.out.println("Positive number: " + countPositive);
        System.out.println("Negative number: " + countNegative);

    }
}
