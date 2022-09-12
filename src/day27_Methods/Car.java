package day27_Methods;

public class Car {
    public static void unlock(){
        System.out.println("Unlocking car");
    }
    public static void openDoor(){
        System.out.println("Opening the door");
    }
    public static void sitAndStart(){
        System.out.println("Sitting down in seat");
        System.out.println("Adjust seat");
        System.out.println("Then insert the key");
        System.out.println("Start the car");
    }
    public static void checkMirrors(){
        System.out.println("Checking left mirror");
        System.out.println("Checking rear view mirror");
        System.out.println("Checking right mirror");
    }
    public static void putOnSeatbelt(){
        System.out.println("Putting on seatbelt");
    }
    public static void drive(){
        System.out.println("Putting into drive");
        System.out.println("Pressing on the accelerator");
    }

    public static void main(String[] args) {
        unlock();
        openDoor();
        sitAndStart();
        checkMirrors();
        putOnSeatbelt();
        drive();
    }
}
