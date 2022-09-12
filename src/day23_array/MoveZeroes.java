package day23_array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        /*
        Move Zeros

	Write a program that will move all the zero numbers to the end of the array.
	The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
         */
        /*
        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[numbers.length]; // store a new array
        int indexToRead=0;// = read every element from beg to end ---> same as i in traditional loop
        int indexToStore=0; // store values into the fixed array, maybe will not increment each time
        while(indexToRead < nums.length){
            if(numbers[indexToRead] ! = 0){
            fixed[indexToStore++] = num[indexToRead];
            }
            indexToRead++;
            }

         */
        int[] numbers = {10, 0, 5, 0, 1, 0};
        int[] numbers2 = new int[numbers.length]; // store a new array
        int numbers3=0;// = read every element from beg to end
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >0){
                numbers2[numbers3++] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers2));
    }
}
