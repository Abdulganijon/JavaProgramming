package day37_Static.phone;

public class Iphone {
    String model;
    String color;
    double price;
    int storage;

    static String os;
    static String brand;

    static{
        System.out.println("Static block run");
        os="IOS";
        brand = "Apple";
    }

    public Iphone(String model, String color, double price, int storage){
        System.out.println("Constructor run");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
