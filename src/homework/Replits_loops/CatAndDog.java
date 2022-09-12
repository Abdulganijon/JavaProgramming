package homework.Replits_loops;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;

            }

        }
        if (countCat == countDog) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
