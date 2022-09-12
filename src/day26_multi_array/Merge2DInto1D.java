package day26_multi_array;

import java.util.Arrays;

public class Merge2DInto1D {
    public static void main(String[] args) {
        /*
        Given a 2D int array merge the elements into one 1D array

Ex:
       int [][] nums = {{10, 20, 30}, {5, 10, 15}};
       Output:
              [ 10, 20, 30, 5, 10, 15 ]

         */
              int[][] nums = {{10, 20, 30},{5, 10, 15}};
              int size = 0;
              for(int[] eachArray:nums){
              size += eachArray.length;
              }
              int[] merged = new int[size];
              int indexToStore=0;
              for(int[] eachArray:nums){
              for(int eachNum: eachArray){
              System.out.println(eachNum);
              merged[indexToStore++] = eachNum;
              //System.out.println(Arrays.toString(merged));
              }
              }
        System.out.println(Arrays.toString(merged));

       /* int[][] numbers = {{10, 20, 30},{5, 10, 15}};
        String s= ""; // String to store new numbers
        for(int[] arr : numbers){
            for(int element : arr){
                s+=element + " "; // we will add each element and will add space" " to seperate them later
            }
        }
        String[] merge = s.split(" ");
        System.out.println(Arrays.toString(merge));

        */
    }
}
