package day30_practice_wrapper;

public class ValidPasswordHW3 {
    public static void main(String[] args) {
        /*
        Valid Password

    Given a String password find out if it is a valid password

    Requirements:

        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter
        Must have at least 1 number
        Must have one of the follow special characters:
            ! @ # $ % ^ & *
         */
        String passw = "1$Wood";
        int countUpper = 0, countLower = 0, countNum = 0, countSpChar = 0;

        if (passw.length() >= 8 && !passw.contains(" ")) {

            for (int i = 0; i < passw.length(); i++) {
                if (Character.isUpperCase(passw.charAt(i))) {
                    countUpper++;
                } else if (Character.isLowerCase(passw.charAt(i))) {
                    countLower++;
                } else if (Character.isDigit(passw.charAt(i))) {
                    countNum++;
                } else {
                    countSpChar++;
                }
            }
            if (countUpper > 0 && countLower > 0 && countNum > 0 && countSpChar > 0) {
                System.out.println("Valid Password");
              }

        } else {
            System.out.println("invalid Password");
        }

    }
}
