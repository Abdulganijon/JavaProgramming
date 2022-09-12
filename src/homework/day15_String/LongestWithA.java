package homework.day15_String;


import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 String inputs");
        String input1 = input.nextLine();
        String input2 = input.nextLine();
        String input3 = input.nextLine();
        String character = "a";
        String result1= "";
        String result2= "";
        String result3= "";


            if(input1.contains(character)){ //"java" has "a" so length of result will be 4
                result1=input1; //java
            }
            if(input2.contains(character)){//"mouse" doesnt have "a" so we will replace with string with length 0
                result2=input2; //0
            }
            if(input3.contains(character)){//"computer" doesnt have "a" so new length will be 0
                result3=input3;//0
            }

            if(result1.length()>result2.length() && result1.length()>result3.length()){
                System.out.println(result1);
            }else if(result2.length()>result1.length() && result2.length()>result3.length()){
                System.out.println(result2);
            }else{
                System.out.println(result3);

            }
                 input.close();

            }

        }

