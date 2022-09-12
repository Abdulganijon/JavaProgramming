package homework.day31_ArrayList;


import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
         */
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('D');
        letters.add('U');
        letters.add('L');
        letters.add('G');
        letters.add('A');
        letters.add('N');
        letters.add('I');
        System.out.println(letters);
        for (Character each : letters) {
            System.out.println(each);

        }




    }
}
