package homework.day30_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i) * 2);
        }

        System.out.println(list);

        System.out.println("-------------------");
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Mike");
        employees.add("Sean");
        employees.add("James");
        employees.add("Nick");
        employees.add("Juan");
        employees.add("Al");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1); // removes the last element in Array
        System.out.println(employees);

        boolean r1 = employees.remove("Nick");
        System.out.println(employees);
        System.out.println(r1);

    }
}

/*
{1,2,3,4,5,6}
{2,4,6,8,10,12}
 */
