package day10_if_statesments;

public class BiggestNumber {
    public static void main(String[] args) {

        int first = 1;
        int second = 3;
        int third = 5;
        int biggest;

        if(first>second && first > third){
            // System.out.println(first + " is the biggest");
            biggest = first;
        }else if (second > first && second > third){
            // System.out.println(second + " is the biggest");
            biggest = second;
        }else {
            // System.out.println(third + " is the biggest");
            biggest = third;

        }
        System.out.println(biggest + " is the biggest");

    }
}
