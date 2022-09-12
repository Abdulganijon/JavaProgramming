package homework.day40_method_overriding.car;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla("Model S", 2021, 50000, "White", 12345);

        BMW bmw = new BMW("X6", 2020, 67350, "black", 12345);

       toyota.start();
       tesla.start();
       bmw.start();




    }
}
