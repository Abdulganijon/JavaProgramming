package homework.day09_IFstatements;

public class TimeOfTheDay {
    /*
    create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23 or 0 - 5, print: Good night
     */
    public static void main(String[] args) {
        int hour = 4;

        if (hour >= 6 && hour <= 11) {
            System.out.println("Good Morning");

        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }
    }

