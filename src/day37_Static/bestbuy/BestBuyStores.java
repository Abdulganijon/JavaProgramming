package day37_Static.bestbuy;

import day37_Static.bestbuy.BestBuy;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);

        // other static members
        System.out.println(Math.PI);


    }
}
