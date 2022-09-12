package day23_array;

import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {
        int[] nums = {4, 213, 6};

        //print whole array
        System.out.println(Arrays.toString(nums));

        // print each line on a seperate line hard coded index
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        // printing each with for loop
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
            // create our own printing format:
            String arrayAsString = "Array ~ ";
            for (int i = 0; i < nums.length; i++) {
                arrayAsString+= nums[i] + " | ";
            }
            arrayAsString+= "~ END";
        System.out.println(arrayAsString);

        // go through with for each loop

        System.out.println("For Each loop:");
        for (int eachNumber: nums ) { // read every element from array beg to end
            System.out.println(eachNumber); // eachNumber == num[i] - these are the same
        }

        }
    }

