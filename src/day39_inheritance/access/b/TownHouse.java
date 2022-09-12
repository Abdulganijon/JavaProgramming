package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class TownHouse extends House {
    public static void main(String[] args) {
        TownHouse house = new TownHouse();
        house.address = "1234432 road";
        house.city = "Virginia";

    }
}
