package homework.day39_inheritance.employee;

public class TeamObject {
    public static void main(String[] args) {
        Tester tester = new Tester("Alen", true, 150_000, true);
        System.out.println(tester);

        Developer developer = new Developer("Malika", false, 170_000, true );
        System.out.println(developer);
        }


    }
    /*
    Create objects of all three to see which variables and methods each object has access to
     */


