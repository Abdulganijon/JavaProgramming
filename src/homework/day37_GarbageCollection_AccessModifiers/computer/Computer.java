package homework.day37_GarbageCollection_AccessModifiers.computer;

public class Computer {
    /*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

     */
     double price;
     String brand;
     String color;

     static boolean hasScreen;
     static boolean hasBattery;
     static boolean hasMemory;

 public Computer(double price, String brand, String color) {
  this.price = price;
  this.brand = brand;
  this.color = color;
 }


 public String toString() {
  return "Computer{" +
          "price=" + price +
          ", brand='" + brand + '\'' +
          ", color='" + color + '\'' +
          '}';
 }
  static{
   System.out.println("Has Screen: " + !hasScreen);
   System.out.println("Has Battery: " + hasBattery);
   System.out.println("Has Memory: " + hasMemory);
  }
 }

