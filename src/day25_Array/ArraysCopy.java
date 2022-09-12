package day25_Array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] other = nums; // is not creating a new array, it is pointing to the same array as line 8

        nums[0] = 10;
        other[2] = 25;

        int[] a = {5, 10, 15};
        int[] b = Arrays.copyOf(a, 3);
        System.out.println("before");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1] = 100;
        System.out.println("After");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
