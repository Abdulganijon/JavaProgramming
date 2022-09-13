package day43_abstraction_interface.learning;

public class AppleStore {
    public static void main(String[] args) {

        // everything I can access without any clas, directly from the interface
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();
      //  obj.getBrand;  Can not access the static members from the classes that implement that interface
        // only access static members of an interface by the interface



    }
}
