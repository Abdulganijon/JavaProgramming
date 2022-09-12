package day34_Custom_classes.car;

public class FinalCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "BMW";
        car1.year = 2022;
        car1.color = "black";
        car1.fuel_Level = 29;

        System.out.println(car1);
        car1.drive();
        car1.fillTank();
        System.out.println(car1.lowFuel());

    }
}
