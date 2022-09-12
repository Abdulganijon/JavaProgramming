package homework.Replits_loops;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:
        String[] word = sentence.split(" ");
        String reverse = "";
        for (int i = word.length - 1; i >= 0; i--) {
            reverse += word[i] + " ";

        }
        System.out.println(reverse.trim());
    }
}
