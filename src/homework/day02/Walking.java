package homework.day02;

import java.util.Scanner;

public class Walking {
    /*
    declare and assign a boolean variable is raining
    declare and assign a temperature variable
    check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it raining?");
        boolean isRaining = input.nextBoolean();
        System.out.println(" Whats the Temperature");
        int temperature = input.nextInt();
        if (isRaining==false && temperature >= 68) {
            System.out.println("Should go for a walk");
        } else {
            System.out.println("Should not go for a walk");

        }
        input.close();
    }

}
