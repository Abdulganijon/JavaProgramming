package homework.Replits_loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
            Integer sum = 0;

            for(int i=0; i<list.size();i++){

                if(list.get(i) < 1){
                    list.remove(list.get(i));
                    i--;
                }else{
                    sum += list.get(i);
                }
            }
            list.add(sum);
        System.out.println(list);

    }
    }





