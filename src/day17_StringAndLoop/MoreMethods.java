package day17_StringAndLoop;

import java.sql.SQLOutput;

public class MoreMethods {
    public static void main(String[] args) {
        // 1. isEmpty() Method checks if String has no characters
        String s = "hello";
        System.out.println(s.isEmpty());

        String s2 = " "; //Space char
        System.out.println(s2.isEmpty());

        String s3 = "";  // Completely empty with no character - returns boolean
        System.out.println(s3.isEmpty());

        // 2. isBlank() checks if the String has only white space characters and no other characters
        // returns as boolean.

        String a = "     "; // Spaces are characters
        System.out.println(a.isEmpty()); // checks if there is characters
        System.out.println(a.isBlank()); // checks for non space characters

        String c = "";
        System.out.println(c.isBlank());
        System.out.println(c.isEmpty());

        // 3. replace
        String str = "Java";
        str = str.replace('a', 'z' );
        System.out.println(str);

        String str2 = "an apple path";
        str2 = str2.replace("a", "(a)");
        System.out.println(str2);

        // Common use case: delete spaces

        String str3 = "    Multiple words here   ";
        System.out.println(str3.trim());
        str3 = str3.replace(" ", "");
        System.out.println(str3);

        // remove only first
        String z = "wooden spoon";
        System.out.println(z.replace("o", "-"));
        System.out.println(z.replaceFirst("o", "-"));

        // how to replace middle character only
        String ex = "Wooden spoon";
        int first0 = ex.indexOf('o');
        int second0 = ex.indexOf('o', first0 +1);
        System.out.println(ex.substring(0,second0));
        System.out.println(ex.substring(second0).replaceFirst("o", "-"));
        System.out.println(ex.substring(0, second0) + ex.substring(second0).replaceFirst("o", "-"));







    }
}
