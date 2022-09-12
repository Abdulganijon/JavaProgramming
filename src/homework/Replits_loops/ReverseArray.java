package homework.Replits_loops;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:

        System.out.println(Arrays.toString(arr));
        String[] arr1 = new String[5];

        for (int j = arr1.length - 1,k=0; j >= 0; j--,k++) {
           arr1[k]= arr[j] ;
        }
        System.out.println(Arrays.toString(arr1));

    }
}

