package homework.day38_OOP_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Daniel", 'M', 28, 110000);
        System.out.println(emp1);

        emp1.setAge(32);
        System.out.println(emp1);

        Employee emp2 = new Employee("", 'Q', 0, -110000);
        System.out.println(emp2);

        Employee emp3 = new Employee("Augun", 'F', 31, 120000);
        emp3.setSalary(emp3.getSalary()+15000);
        System.out.println(emp3);
    }
}
