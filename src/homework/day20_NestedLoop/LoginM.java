package homework.day20_NestedLoop;

import java.util.Scanner;

public class LoginM {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
         String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else{
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("logged in");
                    break;
                }
            }
                if(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                    System.err.println("your account is locked, please contact support team");
                }
            }
        scan.close();
        }


    }


