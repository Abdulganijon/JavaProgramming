package day32_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWIthValues {
    public static void main(String[] args) {
        // convert array to ArrayList
          int[] arr = {3, 5, 1, 1};
        Arrays.asList(arr); // converts the array to ArrayList

        // Create an ArrayList with initial values

        Integer[] arr2 = {3, 4, 4, 6};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr2)); // arr is not valid because it is in int primitive type

        // the way we will usually create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 5, 1, 4));
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("james", "adam", "anna", "Jane")
        );
        System.out.println(names);
    }
}
