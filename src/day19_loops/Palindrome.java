package day19_loops;

public class Palindrome {
    public static void main(String[] args) {
        String name = "anna";
        String reverse = "";

        for (int i = name.length()-1; i >=0; i--) {
            reverse += name.charAt(i);
            
        }
        ;
        System.out.println(reverse);

        if(name.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        System.out.println(name.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
