package homework.day29_Methods;

import java.util.Arrays;

public class AddElementHW7 {
    /*
   Add Element

overload the add element method to accept two String arrays.
For this one add all the given elements from the second array in the the first array.
Ex:
   {"today", "is", "monday"}
   {"no", "softskills", "today"}

output > [today, is, monday, no, softskills, today]
    */
    public static void main(String[] args) {
        String[] ar1 = {"one", "two", "three"};
        String[] ar2 = {"four", "five", "six"};
        System.out.println(Arrays.toString(addElement(ar1, ar2)));

    }
    public static String [] addElement(String[] arr1, String[] arr2) {
        int length=arr1.length+arr2.length;
        String[] newArr1 = new String[length];
        int i =0;
        for (String each: arr1) {
            newArr1[i++]=each;
        }
        for(String each: arr2){
            newArr1[i++]=each;
        }
        return newArr1;
    }
}
