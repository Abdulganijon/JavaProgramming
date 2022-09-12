package homework.day02;

import com.sun.tools.javac.Main;

public class TwoNumberVariable {
    /*
    Do all tasks hardcoded at least, then optionally make them more dynamic with Scanner
________________________________________________________________________

Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
     */
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 45;
        if(number1 > number2){
            System.out.println(number1 + " is bigger");
        }else{
            System.out.println(number2 + " is bigger");
        }

    }
}
