package homework.day38_OOP_Encapsulation.pizzaHW3;
public class PizzaObject {
    public static void main(String[] args) {

        Pizza order1 = new Pizza("medium", 4);
        System.out.println(order1);

       order1.setSize("large"); // setting new size for the pizza
        System.out.println(order1);



        System.out.println(order1.getSize()); // testing get method for size of the pizza
        System.out.println(order1.getNumberOfToppings());

       order1.setNumberOfToppings(2); // testing Set method for number of toppings
        System.out.println(order1);

        //order1.setSize("Xlarge"); Commented out so further code can run
        System.out.println(order1);


        order1.setNumberOfToppings(-5); // if number of toppings negative
        System.out.println(order1);



    }
}
