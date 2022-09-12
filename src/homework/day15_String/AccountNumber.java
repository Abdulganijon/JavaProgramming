package homework.day15_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        /*
        create a class AccountNumber
ask the user enter an account number and check if the account number is valid. Accounts are valid if:
handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number
	lengths do not meet the expected results print “Invalid account number”
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number");
        String validAc = input.nextLine();



        if (validAc.length() == 0) {
            System.out.println("Empty input given");

        } else if (validAc.startsWith("2")) {
                if (validAc.length() == 7) {
                    System.out.println("Valid 7-digit account number");
                } else {
                    System.out.println("Invalid 7-digit number");
                }
        } else if (validAc.startsWith("5")) {
                if (validAc.length() == 10) {
                    System.out.println("Valid 10-digit account number");
                } else {
                    System.out.println("Invalid 10-digit number");
                }
        } else {
                System.out.println("invalid account number");

            }
        }
    }

