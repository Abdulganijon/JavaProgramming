package homework.day24_Arrays;

import java.util.Arrays;

public class SecondBiggestNumber {
    /*
    Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
     */
    public static void main(String[] args) {
        int[] num = {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(num);
        int biggestNum = num[num.length-1];
        int secondBiggest= num[0];
         for (int each:num){
             if (each != biggestNum && each>secondBiggest) {
                 secondBiggest=each;
             }
        }
        System.out.println(secondBiggest);

        }

    }


