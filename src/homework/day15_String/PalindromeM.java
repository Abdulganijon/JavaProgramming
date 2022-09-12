package homework.day15_String;



public class PalindromeM {
    public static void main(String[] args) {
        String word = "level";
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
