package homework.day20_NestedLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letter2 = new char[26];

        char ch = 'Z';
        for(int i = letter2.length-1 ; i <= 0; i--){
        letter2[i]= ch--;
            System.out.println(Arrays.toString(letter2));
    }

    }

}
