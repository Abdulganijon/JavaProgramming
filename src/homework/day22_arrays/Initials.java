package homework.day22_arrays;

public class Initials {
    public static void main(String[] args) {
        /*
        Create a String array that has full names. Go through manually and print the initials of each name.
        Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet
         */

        String []str = {"James Bond", "Harry Poter", "Tony Stark"};
        String initials = "";
        for (int i = 0; i < str.length; i++) {
            initials = str[i].substring(0,1) + str[i].substring((str[i].indexOf(" ")+1),(str[i].indexOf(" ")+2));
            System.out.println(initials);
        }

    }
}
