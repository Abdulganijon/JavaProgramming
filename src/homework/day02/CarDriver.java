package homework.day02;

public class CarDriver {
    /*
    create a class CarDriver
create a main method

    declare and assign these variables with the most appropriate datatypes:
        driver name, car model, license number, license class, speed, is automatic

    create a summary of the information and print it. Be creative
     */
    public static void main(String[] args) {
        String driverName = "John";
        String carModel = "Toyota";
        int licenseNumber = 354;
        char licenseClass = 'A';
        int speed = 100;
        boolean isAutomatic = true;

        System.out.println(driverName + " bought " + carModel+ " with license registration " + licenseClass + licenseNumber + "." + "\nThis car is automatic:" + isAutomatic + "\ntop speed:" + speed);


    }
}
