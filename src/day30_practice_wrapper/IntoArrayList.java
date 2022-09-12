package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntoArrayList {
    public static void main(String[] args) {

        int[] a = {4, 2, 1};
        System.out.println("Number of Elements: " + a.length);
        System.out.println("Print the whole array: " + Arrays.toString(a));
        System.out.println("Access the first Element: " + a[0]);
        System.out.println("Add Elements to the array: - CANNOT change size of array after creation");
        System.out.println("Remove elements from the arrray - CANNON do it");
        System.out.println("Array can hold values that a primitive types and object types");

        System.out.println("---------------------------------------------");
        ArrayList<Integer> nums=new ArrayList<>();//empty ArrayList
        System.out.println("NUmber of elements: "+ nums.size());
        System.out.println("Print the whole array: " + nums);

        System.out.println("adding to ArrayList: add() method");
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());
    }
}


