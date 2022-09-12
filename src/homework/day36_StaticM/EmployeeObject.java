package homework.day36_StaticM;

public class EmployeeObject {
    public static void main(String[] args) {
         EmployeeM employee1 = new EmployeeM();
         employee1.name = "Ahmet";
         employee1.salary = 100000;
        EmployeeM employee2 = new EmployeeM();
        employee2.name = "Augun";
        employee2.salary = 115000;
        EmployeeM employee3 = new EmployeeM();
        employee3.name = "Fady";
        employee3.salary = 120000;

        System.out.println(employee1.name + " : " + employee1.salary);
        System.out.println(employee2.name+ " : " + employee2.salary);
        System.out.println(employee3.name + " : " + employee3.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);

    }
}
