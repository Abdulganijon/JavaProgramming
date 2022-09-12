package homework.day39_inheritance.discord;

public class JavaClass {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin","Allen", 97430);
        System.out.println(admin);
        admin.createChannel();

        Student student1 = new Student("Student", "Kylysh", 295289);
        System.out.println(student1);
        student1.sendMessage();

    }
}
