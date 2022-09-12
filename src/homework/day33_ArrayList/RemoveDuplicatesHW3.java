package homework.day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesHW3 {
    /*
    Remove Duplicates

Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers


Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    count++;

                }
            }
            if (count == 1) {
                result.add(nums.get(i));
            }

        }
        System.out.println(result);

    }
}
