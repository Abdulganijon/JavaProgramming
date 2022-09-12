package homework.day19_ForLoop;



import java.util.Scanner;

public class PrimeNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int num = input.nextInt();
        boolean primeNumber = num %2 !=0 && num%3 !=0 && num %5 !=0 && num %7!=0;

        while(num != 0){

            if (num==5 || num==3 || num==7 || num== 2 || primeNumber) {
                System.out.println("Prime");

            }else{
                System.out.println("Not prime");


    }
            break;
    /*
    Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10

	Output:
		not prime
     */

    }

    }
}
