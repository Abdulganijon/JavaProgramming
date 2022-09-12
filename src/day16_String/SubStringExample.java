package day16_String;

public class SubStringExample {
    public static void main(String[] args) {
        String s = "infinity";
        //          01234567
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));
        System.out.println(s.substring(8));

        System.out.println(s.substring(1,6));
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(3,7));
        System.out.println(s.substring(3,8));
    }


}
