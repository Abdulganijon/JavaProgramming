package homework.day02;

import java.util.Scanner;

public class BuyHouse {
    /*
    create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your credit score");
        int creditScore = input.nextInt();
        System.out.println("Please enter your salary");
        int salary = input.nextInt();
        if((creditScore >= 720 && salary >= 100000) || (creditScore >= 740 && salary >= 80000)){
            System.out.println("Eligible to get a loan");
        } else {
            System.out.println("Not eligible");
        }
        input.close();
    }
}
