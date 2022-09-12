package homework.day29_Methods;

import java.util.Arrays;

public class AddElementHW6 {

        public static void main(String[] args) {
            String[] arr1 = {"One", "Two", "Three"};
            String str1 = "Four";
            System.out.println(Arrays.toString(addElement(arr1, str1)));
        }
        /*
        Add Element

    create a method that will accept a String array and a String element.
     Add the given element value into the end of the array.
      Do not replace the last index of the given array,
       but instead create a new array with a bigger size to fit all the original elements plus the new one
         */
        public static String[] addElement(String[] arr, String str){ //7
            String[] newArr = new String[arr.length+1];
            for (int i = 0; i <arr.length ; i++) {
                newArr[i] = arr[i];
                newArr[newArr.length-1] = str; //last element


            }
            return newArr;
        }
    }

