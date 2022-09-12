package homework.Replits_loops;

import java.util.Scanner;

public class Zombie {

        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner input = new Scanner(System.in);

            //WRITE YOUR CODE BELOW
            String guestList="";
            while(true){
                System.out.println("Please enter the guest's name:");
                String name = input.nextLine();
                System.out.println("Do you want to enter another guest's name?");
                String answer = input.nextLine();
                guestList += name + ", ";
                if (answer.equals("no")) {
                    break;
                }
            }
            System.out.println("Guests' list: " + guestList.substring(0,guestList.length()-2));
        }
    }
