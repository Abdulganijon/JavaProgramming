package homework.day42_Abstraction;


import day36_Custom_classes.Test;

import java.util.Properties;

public interface PropertiesOfInterface {

    int a = 100; // static and final by default
    static int b=200; // final by default

   // public PropertiesOfInterface(int a){
       // this.a = a;
   // }
    /*static{
        b=100;
    }

     */
    /*
    public void method1(){
        System.out.println("Instance Method");
    }

     */
    public static void method2(){
        System.out.println("Static Method");
    }
    public abstract void method3();

    default void method(){
        System.out.println("Default Method");
    }

   /* class Test implements PropertiesOfInterface{

        @Override
        public void method() {

        }
    }

    public static void main(String[] args) {
        new Test().method4();
    }

    */
}
