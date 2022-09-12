package homework.day36_StaticM;

public class Iphone {
    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String colors;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;


    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    //public static void printModelAndPrice(){
     //  System.out.println(model + " : " + price); // static methods in java does not accept instances
   // }



    public void method1(){
        System.out.println(model + " : " + price);
    }
}
