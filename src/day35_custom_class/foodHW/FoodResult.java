package day35_custom_class.foodHW;

public class FoodResult {
    public static void main(String[] args) {

        Food item1 = new Food("Water", 2, 4.49);
        System.out.println(item1);

        Food item2 = new Food("cake", 1, 15.50);
        System.out.println(item2);

        double totalAmount  = item1.calculatePrice() + item2.calculatePrice();

        System.out.println("Your total for today: " + totalAmount);

    }
}
