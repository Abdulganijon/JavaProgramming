package day15_String;

public class Recap {
    public static void main(String[] args) {

        String first = "Testing";
        first = first.toUpperCase();
        System.out.println(first);

        String second = "SOFT SKILLS";
        second = second.toLowerCase();
        System.out.println(second);

        String third = "   hello  world  ";
        System.out.println(third.length());
        third = third.trim();
        System.out.println(third.length());
        System.out.println(third);
    }
}
