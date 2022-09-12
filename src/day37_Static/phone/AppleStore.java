package day37_Static.phone;

public class AppleStore {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone X", "black", 1000, 128);
        System.out.println(iphone1);
        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);
        Iphone iphone2 = new Iphone("Iphone 7", "silver", 1000, 128);
        System.out.println(iphone2);


    }
}
