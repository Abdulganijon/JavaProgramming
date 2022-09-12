package day17_StringAndLoop;

public class RelativeChecker {
    public static void main(String[] args) {
        String name1 = "James Bond";
        String name2 = "Jamie Bond";

        int indexOfSpace = name1.lastIndexOf(' '); // '' used for one char. while "" used for multiple ch
        String lastName = name1.substring(indexOfSpace+1);
        if(name2.endsWith(lastName)){
            System.out.println("Related");
        }else {
            System.out.println("Not Related");;
        }
        System.out.println(name2.endsWith(lastName) ?"Related" : "Not Related");
    }
}
