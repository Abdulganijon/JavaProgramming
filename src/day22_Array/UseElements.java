package day22_Array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {
        int[] nums = {4, 5, 12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]);
        String [] str = {"Hello", "World", "java", "code"};
        System.out.println(str.length);
        System.out.println(str[2]);
        System.out.println(str[2] + str[3]);
        System.out.println(str[0].length());
        System.out.println(str[1].charAt(str[1].length()-1));
        String s =str[3];

    }
}
