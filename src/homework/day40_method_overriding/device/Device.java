package homework.day40_method_overriding.device;

public class Device {
    /*
    Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
     */

    String brand;
    String model;
    double price;
    boolean wireless;

    public Device(String brand, String model, double price, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }


    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
    public String useDevice(){
        return "Using";
    }
}
