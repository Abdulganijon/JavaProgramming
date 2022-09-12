package day21_NestedLoops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go to ?");
        int range = input.nextInt();

        for (int i = 2; i < range ; i++) { //Starting from 2 and going until the range number
            boolean isPrime = true;

            for (int j = 2; j <i; j++) { // starting from 2 because I want to check divisibility of number from 2 to the number itself
                if(i %j == 0){ // the number we are checking (i) is evenly divisible by the values(from 2 to the number) it means its not prime
                isPrime = false;
                break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }



    }
}
