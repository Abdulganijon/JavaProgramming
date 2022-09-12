package homework.day02;

public class TimeOfTheDay {
    public static void main(String[] args) {
        /*
        create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
         */

        int time1 = 18;
        if (time1<=11 && time1>=6){
            System.out.println("Good Morning");
        } else if(time1>=12 && time1<=16){
            System.out.println("Good Evening");
        }else  {
            System.out.println("Good night");
        }
    }
}
