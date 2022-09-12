package homework.day40_method_overriding.device;

public class Phone extends Device {
    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String useDevice(){
        return super.useDevice() + " Phone ";
    }
    /* Create a class called Phone:
            - attributes: brand, model, price, wireless
- methods: toString(),
    useDevice(): Override to print Using Phone

    */
}
