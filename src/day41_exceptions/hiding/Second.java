package day41_exceptions.hiding;

import day41_exceptions.hiding.First;

public class Second extends First {



    public static void staticMethod(){
        System.out.println("Static method from Second");


    }
    public void instanceMethodB(){
        staticMethod();// calls the closest method, which is line 5 method in this class
    }


}
