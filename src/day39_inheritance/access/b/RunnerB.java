package day39_inheritance.access.b;

public class RunnerB {
    public static void main(String[] args) {
        TownHouse house = new TownHouse();
        house.address = "1234432 road";
       //  house.city = "Virginia"; not accessible outside of the package
        // house.state; state is default
        // house.zipcode; is private


    }
}
