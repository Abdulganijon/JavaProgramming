package day32_ArrayList;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>(Arrays.asList("friday", "java", "summer", "summer", "reading", "java", "coding"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "coding"));

        // testing the EasyData
        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);
    }

    public static int searchInList(ArrayList<String> list, String target){
        int count = 0;
        for (String each : list) {
            if(each.equalsIgnoreCase(target)){
                count++;

            }

        }
        return count;

    }
}
