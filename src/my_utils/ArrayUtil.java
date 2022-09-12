package my_utils;

public class ArrayUtil {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array
     */
    public static int minNumber(int ... numbers) {
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }

    /*
    Max Number

create a method that will accept an int array and return the biggest number from the array

     */
    public static int maxNumber(int ... numbers) {
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    /*
    Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static boolean contains(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;

        }
    }

    /*
    IndexOf

create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index
     */
    public static int indexOf(int[] arr, int num) {
        int indexOf = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }

    /*
    IndexOf

overload the indexOf method to work with String array and String element
     */
    public static String indexOf(String[] arr, String str) {
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                str1 = arr[i];
                break;
            }
        }
        return str1;
    }

    public static String[] addElement(String[] arr, String str) { //7
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[newArr.length - 1] = str; //last element
        }
        return newArr;
    }
    /*
    Add Element

overload the add element method to accept two String arrays.
 For this one add all the given elements from the second array in the the first array.
 Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}

output > [today, is, monday, no, softskills, today]
     */

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



