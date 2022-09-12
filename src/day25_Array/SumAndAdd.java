package day25_Array;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {
        /*
        given an array add all the elements and add the sum value to the end of the array
        int[] = {5,1,2}
        {5,1,2,8}
         */
        int[] arr = {5, 1, 2, 10};
        int sum = 0;
        for(int each : arr){
            sum+= each; // goes through every elements and add to the sum variable
        }
        int[] newArr = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr));
        newArr[newArr.length-1] = sum; // Storing the sum value into the last index of the newArr
        System.out.println(Arrays.toString(newArr));
    }
}
