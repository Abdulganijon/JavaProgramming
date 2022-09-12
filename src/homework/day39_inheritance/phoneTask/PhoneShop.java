package homework.day39_inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone phone = new Iphone("13Pro","7.5", 1199, "white");
        System.out.println(phone);
        phone.call(911);
        phone.text(12345678);
        phone.faceTime(394829342);
        phone.faceTime("Yahoo@gmail.com");
    }
}
