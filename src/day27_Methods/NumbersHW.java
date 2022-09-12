package day27_Methods;

import java.util.Scanner;

public class NumbersHW {
    /*
    create a method that will accept a number.
     Find and print if it is a positive number, negative number, or zero
     */
    public static void main(String[] args) {
       // number(-5);

      Scanner input = new Scanner(System.in);
      number(input.nextInt());
      int x =3;
      number(x);

    }
    public static void number(int x){
        int number = x;

        if(number>0){
            System.out.println("The number " + number + " is positive");
        }else if(number<0){
            System.out.println("The number" + number + " is negative");
        }else if(number ==0){
            System.out.println("The number is" + number);
        }
    }
}
