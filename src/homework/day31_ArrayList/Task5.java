package homework.day31_ArrayList;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /*
        Try to loop:

Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
         */
        ArrayList<Double> nums = new ArrayList<>();
        nums.add(1.0);
        nums.add(2.0);
        nums.add(3.0);
        nums.add(4.0);
        nums.add(5.0);

        double maxNum = nums.get(0);
        for (Double each : nums) {
            if(each>maxNum){
                maxNum=each;
            }

        }
        System.out.println(maxNum);
    }
}
