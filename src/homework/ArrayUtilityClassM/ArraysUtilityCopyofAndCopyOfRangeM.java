package homework.ArrayUtilityClassM;

import java.util.Arrays;

public class ArraysUtilityCopyofAndCopyOfRangeM {
    public static void main(String[] args) {
        String[] student = {"Elif", "Sinem", "Gunay", " Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(student, 3);
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------");
        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1);
        System.out.println(Arrays.toString(ch2));

        int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] result = Arrays.copyOfRange(score, 3,7+1);

        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(score, 5, score.length);
        System.out.println(Arrays.toString(result2));
    }
}
