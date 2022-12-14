package homework.day30_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        numbers.add(2,25);
        numbers.add(4,35);

        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1; // this is how to find last index  or length in Strings
        System.out.println("lastIndex: " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " +num);
        System.out.println("------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

            System.out.println("----------------------");

            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript"); // replace
            list.set(3,"C++");

            System.out.println(list);
        }





    }
}
