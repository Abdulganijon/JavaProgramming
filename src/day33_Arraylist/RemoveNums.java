package day33_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {               //     0 1 2 3
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,5,2,5,2,5,1,8,9,7,4,10,0,2,3));
        for (int i = 0; i < nums.size(); i++) {
           if(nums.get(i) < 5){
               nums.remove(i);
               i--;
                // if I removed an element, the element will move over which means their index will change,
               // I substract 1 to make sure I dont skip elements
           }
        }
        System.out.println(nums);

    //--------------------------
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,5,2,5,2,5,1,8,9,7,4,10,0,2,3));
        nums2.removeIf(n-> n < 5); // n will be every element
        System.out.println(nums2);

    }
}
