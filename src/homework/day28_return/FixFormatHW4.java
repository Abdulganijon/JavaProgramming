package homework.day28_return;

import java.util.Locale;

public class FixFormatHW4 {
    public static void main(String[] args) {
        String str = "AbDuLGaNi";
        System.out.println(properFormat(str));

    }
    public static String properFormat(String word){
      word=word.toLowerCase();
        String result = (word.charAt(0) +"").toUpperCase() + word.substring(1);
        return result;

        }


    }

    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James

     */

