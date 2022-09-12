package day12_switch;

public class NumberToWord {
    /*
    number from 1-5
    convert the number to number word
    1 -> one
    2 -> two
    ..
    5-> five
    default case
     */
    public static void main(String[] args) {
        int number = 6;

        switch (number){
            case 5:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
            case 3:
                System.out.println("3");
                break;
            case 2:
                System.out.println("2");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("Number should be between 1 to 5");
        }
    }
}
