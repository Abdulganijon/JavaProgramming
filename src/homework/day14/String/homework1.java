package homework.day14.String;

public class homework1 {
    /*
    Declare and assign a String for password
    the password should be more than 8 character long
    print: Valid password or Invalid password
     */
    public static void main(String[] args) {
        String password = "Woodenspoon";
        



        if (password.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");

        }
    }
}

