package day41_exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args){
        System.out.println("Hello");

        //sleep(2.5); // throws


        System.out.println("Hello World");

        System.out.println("----------");
        System.out.println("Hello");
        MorningWorkout.sleep(2.5); // try & catch
        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {
        Thread.sleep((long)(seconds *1000));

    }
}
