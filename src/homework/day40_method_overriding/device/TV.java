package homework.day40_method_overriding.device;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String toString() {
       return super.toString();
    }

    @Override
    public String useDevice() {
        return super.useDevice() + "TV ";
    }
}
/*
            Create a class called TV:
        - attributes: brand, model, price, wireless
        - methods: toString(),
            useDevice(): Override to print Using TV
             */