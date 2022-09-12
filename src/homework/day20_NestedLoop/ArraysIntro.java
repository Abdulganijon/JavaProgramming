package homework.day20_NestedLoop;


import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // Create a variable that's capable enough to contain 5 names
        String[] myGroups = new String[5]; // 0~4 index elements
        // int[] myGroup = new int[5]; // just another way
        myGroups[0] = "Gunay";
        myGroups[1] = "Neira";
        myGroups[2] = "Suat";
        myGroups[3] = "Hulya";
        myGroups[4] = "Mikaela";

       // System.out.println(myGroups); // hashcode
        System.out.println(Arrays.toString(myGroups)); // TODO: Default way how to print it.
        System.out.println("----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number < 1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
