package day23_array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

       /*
        number[0] = 5;
        number[1] = 4;
        number[2] = 3;
        number[3] = 2;
        number[4] = 1;
        System.out.println(Arrays.toString(number));
        */

        int[] number = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[number.length];

        for (int i = number.length - 1, j = 0; i >= 0; i--, j++) { // i goes backwards
            numbers2[j] = number[i];
        }
        System.out.println(Arrays.toString(numbers2));

        }
    }

