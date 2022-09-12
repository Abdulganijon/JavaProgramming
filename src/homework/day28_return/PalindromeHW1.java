package homework.day28_return;

public class PalindromeHW1 {
    /*
    create a method that  will accept a String and find if it is Palindrome or not (boolean)
     */
    public static void main(String[] args) {
    boolean result =Palindrome("anna");
        System.out.println(result);
    }
    public static boolean Palindrome(String word){
        String result="";
        for(int i= word.length()-1;i>=0; i--){
            result+=word.charAt(i);
        }
        if(word.equalsIgnoreCase(result)){
            return true;
        }else{
            return false;
        }
    }

}
