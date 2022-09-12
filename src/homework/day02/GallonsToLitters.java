package homework.day02;

public class GallonsToLitters {
    /*
    create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters
     */
    public static void main(String[] args) {
        int gallon = 20;
        double liters = 3.78541 * gallon;
        System.out.println(liters);
    }
}
