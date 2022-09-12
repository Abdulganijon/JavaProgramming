package homework.day26_CustomMethod_Void;

public class MainMethodPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("-----------------");
        helloCydeo5Times();
        System.out.println("---------------");
        evenNumbers();
    }
    // create a function that can print hello world 5 times
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }
    // creat a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Cydeo");
        }
    }
    // create a function that can print all the even numbers from 1-10 > evenNumbers
    public static void evenNumbers(){
        for (int i = 0; i < 11; i+=2) {
            System.out.println("Even numbers = " +(i));

            }

        }
    }

