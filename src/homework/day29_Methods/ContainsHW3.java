package homework.day29_Methods;

import java.util.Arrays;

public class ContainsHW3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int num1 = 2;
        System.out.println(contains(arr1, num1));

    }

    public static boolean contains(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}


