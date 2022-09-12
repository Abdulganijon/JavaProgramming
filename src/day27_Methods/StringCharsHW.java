package day27_Methods;

public class StringCharsHW {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */
    public static void main(String[] args) {
        characters("Abdulgani");
    }
    public static void characters(String str){
        String[] arr = str.split("");
        for (String each : arr) {
            System.out.println(each);
        }
    }
}
