package homework.day22_arrays;

import java.util.Arrays;

public class FiveNumbers {
    public static void main(String[] args) {
        /*
        Create an array of 5 numbers. Manually reverse the array

No loop yet
         */


      int[] numbers = {1,2,3,4,5};

        numbers[4] = 5;
        numbers[3] = 4;
        numbers[2] = 3;
        numbers[1] = 2;
        numbers[0] = 1;

      System.out.println(Arrays.toString(numbers));
        System.err.println(Arrays.toString(numbers));

    }
}
