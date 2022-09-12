package homework.day28_return;

import java.util.Arrays;

public class MinAndMaxNumbersHW78 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 10};
        System.out.println("Smallest number: " + smallestNum(arr));

        System.out.println("Biggest number: " + biggestNum(arr));

        int[] numArr = {4, 5, 60, 55, 4};
        int number = 60;
        System.out.println(contains(numArr, number));

        System.out.println(Arrays.toString(addNumberToArray(numArr, number)));
    }

    public static int smallestNum(int[] nums) {
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        return minNum;
    }

    public static int biggestNum(int[] nums) {
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static boolean contains(int[] numsArr, int num) {
        int count = 0;
        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] == num) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] addNumberToArray(int[] arr, int num) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;
        return newArray;
    }

}
    /*
    Min Number
create a method that will accept an int array and return the smallest number from the array

Max Number
create a method that will accept an int array and return the biggest number from the array

Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.

Add Element
create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */


