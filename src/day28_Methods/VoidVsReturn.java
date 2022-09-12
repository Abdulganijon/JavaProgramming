package day28_Methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        sayHello();
        sayBye();
        System.out.println(sayBye()); // method returns String, I am print a String
        String str=sayBye(); // method returns String and assigned the result
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static String sayBye(){
        return "Bye";
    }
}
