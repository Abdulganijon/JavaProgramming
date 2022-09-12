package day27_Methods;

public class Parameters {
    public static void greeting(String name){
        System.out.println("Hello" + name);
        System.out.println("Nice to meet you " + name);
    }
    public static void age(int birthYear){
        System.out.println("You are " + (2022-birthYear)+" years old");
    }

    public static void main(String[] args) {
        greeting("Saim");

        age(2000);
    }
}
