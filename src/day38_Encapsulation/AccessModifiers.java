package day38_Encapsulation;

public class AccessModifiers {
    public int a = 5;
    int b = 10;
    private int c = 20;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
