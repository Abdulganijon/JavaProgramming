package homework.day02;

public class VariableNumberIsBigger {
    /*
    Create three number variables
Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest
     */
    public static void main(String[] args) {
        int number1 = 50;
        int number2 = 45;
        int number3 = 100;
        int number4 = 200;
        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println(number1 + "is biggest");
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println(number2 + " is biggest");
        } else if (number3 > number1 && number3 > number2 && number3 > number4){
            System.out.println(number3 + " is biggest");
        }else {
        System.out.println(number4 + " is biggest");
        }


    }

}
