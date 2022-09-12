package homework.day38_OOP_Encapsulation.pizzaHW3;

public class Pizza {
    /*
     create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */

    private String size;
    private int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings<0){
            System.err.println("Please enter a positive number of toppings");
            System.exit(0);
        }
        this.numberOfToppings = numberOfToppings;
    }
    public double calculatePrice(){

        /*
        if(size!=null){
        return(size.equals("small") ? 4 : size.equals("Medium") ? 6 : 8)+ numberOfToppings *0.75;
        }
        return -1;
         */
        double priceForToppings = numberOfToppings *0.75;

        if(!(size.equalsIgnoreCase("small")|| size.equalsIgnoreCase("large") || size.equalsIgnoreCase("medium"))){
            System.err.println("Invalid pizza size = " + size);
            System.exit(0);
        }
        if(size.equalsIgnoreCase("small")){
            return 4 + priceForToppings;
        }else if(size.equalsIgnoreCase("medium")){
            return 6+priceForToppings;
        }else{
            return 8+priceForToppings;
        }
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings + ", Total cost of pizza=$" + calculatePrice()+
                '}';
    }
}
