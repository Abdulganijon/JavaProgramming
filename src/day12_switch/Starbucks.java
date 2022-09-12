package day12_switch;

public class Starbucks {
    public static void main(String[] args) {

        String size = "venti"; // input.nextLine()
        double price = 0;
        int calories = 0;

        switch (size){

            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.0;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("There is no size " + size);
                return;

        }
        if(price !=0 && calories!=0){
        System.out.println("Size: " + size + " is " + calories + " calories and cost $"+ price);

    }
}
    }
