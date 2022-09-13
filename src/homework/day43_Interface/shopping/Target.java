package homework.day43_Interface.shopping;

import homework.day43_Interface.shopping.Shopping;

public final class Target extends Shopping {


    @Override
    public void buyItem() {
        System.out.println("Is Buying item");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the item");

    }
}
