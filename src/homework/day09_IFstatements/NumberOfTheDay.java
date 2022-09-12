package homework.day09_IFstatements;

import java.util.Scanner;

public class NumberOfTheDay {
    /*
    create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2){
            System.out.println("Tuesday");
        }else if(day ==3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("a\nThursday");
        }else if(day == 5){
            System.out.println("5\tFriday");
        }else if(day == 6){
            System.out.println("5\\Saturday");
        }else if(day == 7){
            System.out.println("\"" + day + "\"" + " Sunday");
        }else {
            System.out.println(" 6\'Not a valid entry");
        }
        input.close();
    }
}

