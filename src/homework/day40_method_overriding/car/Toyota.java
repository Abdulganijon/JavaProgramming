package homework.day40_method_overriding.car;

public class Toyota extends Car{


    public Toyota( String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }
    public void reliable(){
        System.out.println(brand+"is reliable");
    }



    }

