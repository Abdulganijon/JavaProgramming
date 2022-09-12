package day11_nested;

public class Diver {
    public static void main(String[] args) {
        int tank = 81;
        String message = "";

        if(tank > 90){
            message = "Your tank is full";
        }else if(tank > 80){
            message = "Still okay";

        }else if(tank > 70){
            message = "Dont go to far";
        }else if(tank > 60){
            message = "Start to head back";
        }else if(tank > 50){
            message = "Be carefull now you at 50%";
        }
        System.out.println(message);
    }
}
