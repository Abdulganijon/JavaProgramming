package homework.day42_Abstraction.employee;

public class EmployeeObject {
    public static void main(String[] args) {
        //Person person = new Person("Josh",35,'M');
        //Employee employee = new Employee(

        Tester tester = new Tester("Josh",18,'M',001, "Sdet", 110000);
        Developer developer = new Developer("Mike",18,'M',001, "Dev", 110000);
        Teacher teacher = new Teacher("Alen",18,'M',001, "Teacher", 110000);
        Driver driver = new Driver("Jay",18,'M',001, "Driver", 110000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        developer.work();
        developer.sleep();
        //developer.bugReport();
        developer.eat();
        developer.unitTest();

        teacher.work();
        teacher.sleep();
        teacher.eat();


    }
}
