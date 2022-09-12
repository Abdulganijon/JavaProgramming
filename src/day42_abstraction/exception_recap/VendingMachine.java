package day42_abstraction.exception_recap;

public class VendingMachine {
    public static String select(int selection) {
        String item = "";
        if (selection == 1) {
            item = "chips";
        } else if (selection == 2) {
            //    item = "Gum"; ---> out of stock
            throw new OutOfStockException();// causes the exception to happen
        } else if (selection == 3) {
            item = "Candy";
        }
        return item;
    }

    public static String selectValid(int selection) throws InvalidSelectionException {
        String item = "";
        if (selection == 1) {
            item = "chips";
        } else if (selection == 2) {
            item = "Gum";
        } else if (selection == 3) {
            item = "Candy";
        } else {
            throw new InvalidSelectionException();// checked exception must be handled  - but also created this so I dont have to handle myself
        }
        return item;
    }
}

