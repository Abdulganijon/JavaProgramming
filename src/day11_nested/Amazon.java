package day11_nested;

public class Amazon {
    public static void main(String[] args) {

        double price = 100.99;
        boolean isPrime = false;

        if (isPrime) {
            System.out.println("Free 2 day shipping");
        } else {
            // you dont have price
            if (price >= 25) {
                System.out.println("Free shipping available");
            } else {
                System.out.println("shipping cost is $2.99");


            }
        }
    }
}

