package homework.day02;

public class SalesAmounVariable {
    /*
    create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */
    public static void main(String[] args) {
        int salesAmount = 10000;
        if (salesAmount < 10000){
            System.out.println("No Bonus");

        }if (salesAmount >= 10000 && salesAmount<15000){
            System.out.println(" 5000 Bonus");
        }if (salesAmount >=15000) {
            System.out.println(" 7000 Bonus");


        }
    }
}
