package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArraysUtilClass {
    public static void main(String[] args) {
        int num = ArrayUtil.minNumber(4, 2, 1, -5, 1, -1, 2, 5, 2);
        System.out.println(num);
        System.out.println(ArrayUtil.minNumber(5, 3,4,5,2,5,8));

        System.out.println(ArrayUtil.maxNumber(5, 3,4,5,2,5,8));

        int[]a = {45, 2, 6, 2, 6, 23, 83, 12};
        System.out.println(ArrayUtil.maxNumber(a));
        System.out.println(ArrayUtil.maxNumber(new int[]{4,5,2,5,2}));

        int[]b = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.contains(b, 13));
        System.out.println(ArrayUtil.contains(b, 5));


        /*
        add indexOf
         */

        System.out.println("------------------\n Add Element method");
        String[] words = {"java", "is", "the", "best"};
        String[] allWords = ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allWords));
        System.out.println("------------------\n Add Element method");

        String [] strs = {"today", "is", "Tuesday"};
        String[] other = {"no", "softskills", "today"};
        String[] multipleAdded = ArrayUtil.addElement(strs,other);
        System.out.println(Arrays.toString(multipleAdded));
    }
}
