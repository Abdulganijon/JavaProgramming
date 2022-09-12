package day15_String;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "java";



        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Fourth char " + s.charAt(3));
        // System.out.println("invalid char" + s.charAt(100)); is not a valid index in our String


        System.out.println("length" + s.length());
        System.out.println("last inder: " + 3);
    }
}
