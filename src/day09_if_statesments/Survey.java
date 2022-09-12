package day09_if_statesments;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a studen? T/F");
        boolean isStudent = input.nextBoolean();
        String report = "";

        if(isStudent){
            System.out.println("What are you studying?");
            String subject = input.next();
            System.out.println(subject);
            report += "Studying: " + subject;

        }
        System.out.println("Do you live in a city? T/F");

        if(input.nextBoolean()) {
            System.out.println("Cool, cities are loud and fun");
        } else {
            System.out.println("how many years have you lived in the suburb?");
            int years = input.nextInt();
            System.out.println(years);
            report += "\n Living in suburb for " + years + " years";

        }
        input.close();
    }
}
