package day35_custom_class.employeeHW;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeResult {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shirin",30,"Manager", 1_500_000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Nurzat",25," Assistant Manager", 1300000);
        System.out.println(employee2);

        Employee employee3 = new Employee("Jasmine",28,"CEO", 2000000);
        System.out.println(employee3);

        employee1.goToMeeting();
        employee2.goToMeeting();
        employee3.goToMeeting();

    Employee employee4 = new Employee("Anna");
        System.out.println(employee4);

        Employee employee5 = new Employee("James", 12);
        System.out.println(employee5);


        Employee employee6 = new Employee("Bond", 15, "CEO");
        System.out.println(employee6);
        System.out.println("---------------------------------------------");

        EmployeeV2 james2 = new EmployeeV2("james bond", 7, "spy", 10_000_000);
        System.out.println(james2);

        EmployeeV2 james3 = new EmployeeV2("james bond");
        System.out.println(james3);

        EmployeeV2 obj11 = new EmployeeV2("Jane", 9);
        System.out.println(obj11);

        EmployeeV2 obj12 = new EmployeeV2("Penny", 12, "CEO");
        System.out.println(obj12);

        // for practice:
        Employee[] arr = new Employee[3];
        arr[0] = employee1;
        arr[1] = employee2;
        arr[2] = employee3;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0].name);
        System.out.println(arr[0].salary);

        ArrayList<Employee> list = new ArrayList<>();
    }
}
