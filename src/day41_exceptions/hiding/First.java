package day41_exceptions.hiding;

public class First {
    public static void staticMethod(){
        System.out.println("Static method from First");
    }
    public void instanceMethodA(){
        staticMethod(); // calls the closest method, which is line 5 method in this class
    }
}
