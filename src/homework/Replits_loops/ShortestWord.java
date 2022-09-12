package homework.Replits_loops;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String[] strs = str.split(", ");//olive, fish, pursuit, old, warning, python, java, coffee,
        int minLength = strs[0].length(); //5
        String wordsWithMin = "";

        for (int i = 0; i < strs.length; i++) { //find min length
            if (strs[i].length() < minLength) {
                minLength = strs[i].length(); //3
            }
        }

        for (int j = 0; j < strs.length; j++) {// compare each length to min length
            if (strs[j].length() == minLength) {
                wordsWithMin += strs[j] + " ";//add each string with length 3 to string
            }
        }
        String[] arr1 = wordsWithMin.split(" ");//[old,cat,ray]

        System.out.println(Arrays.toString(arr1));
    }
}
