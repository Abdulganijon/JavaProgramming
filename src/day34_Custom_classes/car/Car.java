package day34_Custom_classes.car;

public class Car {
    /*
    Create a class Car

create instance variables:
    model, year, color, fuel level (percent number)

create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

Create a separate class to create Car objects and test the methods created
     */
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel_Level=" + fuel_Level +
                '}';
    }

    String model;
    int year;
    String color;
    int fuel_Level;

    public void drive(){

        System.out.println("Driving model: " + model);
        System.out.println("Fuel level: " + fuel_Level +" %");
        fuel_Level -= 5;
    }
    public void fillTank(){
        int fuel_amount = 100 - fuel_Level;
        System.out.println("Fill tank by: "+ fuel_amount+" %");
    }
    public boolean lowFuel(){

        if(fuel_Level <= 25){
            return true;
        }else{
            return false;
        }
    }
}
