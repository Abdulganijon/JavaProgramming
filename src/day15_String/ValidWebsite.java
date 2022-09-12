package day15_String;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".gov") ||website.endsWith(".edu")||website.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(website + " Valid Website");
        } else {
            System.out.println(website + " Invalid Website");

            if(!validStart){
                System.out.println("Website should start with www.");
            }
            if(!validEnd){
                System.out.println("Website should end with .com or .edu or .gov or .net");
                System.out.println("----------------------");
                String s = "hello world today";
                System.out.println("word.startsWith(hello wor)" + s.startsWith("hello wor"));

                System.out.println("-------------------------");

                String str = "today it is 80 degrees";
                System.out.println(str);
                System.out.println("str.contains(today))" + str.contains("today"));
                System.out.println("str.contains(it is))" + str.contains("it is"));
                System.out.println("str.contains(degrees))" + str.contains("degrees"));
                System.out.println("str.contains(it 80)) exact sequence" + str.contains("it 80"));

                System.out.println(str.contains("80") && str.contains("today"));
            }
        }
    }
}
