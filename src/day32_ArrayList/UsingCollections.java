package day32_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(852, 102, 532, 352, 52, 881, 303, 77, 245, 583));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println("Before: " + list);
        Collections.sort(list);
        System.out.println("After: " + list);

        System.out.println("2nd min: " + list.get(1));
        System.out.println("2nd Max: " + list.get(list.size()-2));

// alternative: list.remove(Collection.max(list))
        // then use Collections.max(list) -> 2 find 2nd max

        Collections.shuffle(list);
        System.out.println(list);

    }
}
