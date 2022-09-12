package day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {

        try{
            String s = "hello world";
            System.out.println(s.charAt(-1));
            System.out.println(s.charAt(1));

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("The String was too short. It went out of bounds ");
        } // catch block only runs if an exception happens
        System.out.println("Hello");

       try{
           Thread.sleep(5000);
        }catch (InterruptedException e){
           System.out.println("Invalid time given");

       }

        System.out.println("World");

    }
}
