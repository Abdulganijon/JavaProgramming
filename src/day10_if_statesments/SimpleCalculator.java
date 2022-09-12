package day10_if_statesments;

public class SimpleCalculator {
    public static void main(String[] args) {

        double numOne = 5;
        double numTwo = 2;
        char operator = '*';
        double result = 0;

        if (operator == '+') {
            result = numOne + numTwo;
        } else if (operator == '-') {
            result = numOne - numTwo;
        } else if (operator == '*' || operator == 'x') {
            result = numOne * numTwo;
        } else if (operator == '/') {
            result = numOne / numTwo;
        } else if (operator == '%') {
            result = numOne % numTwo;
        } else {
            System.out.println("invalid operator");
        }
        System.out.println("" + numOne + operator + numTwo + "= " + result);
    }
}
