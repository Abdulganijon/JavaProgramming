package replits;
import java.util.Scanner;
public class itemResult {
    public static void main(String[] args) {

        // DO NOT TOUCH ANY CODE HERE

        Scanner input = new Scanner(System.in);
        Item item = new Item(input.nextLine(), input.nextDouble());
        System.out.println(item);
    }
}
