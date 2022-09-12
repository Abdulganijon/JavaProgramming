package homework.day40_method_overriding.device;

public class UseDevice {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone", "13ProMax",1099, true);
        System.out.println(iPhone);
        iPhone.useDevice();

        TV samsung = new TV("Samsung", "OLED", 1699, true);
        System.out.println(samsung);
        samsung.useDevice();






        /*
        create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
         */
    }
}
