package homework.day02;

public class GiftCard {
    /*
    create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end
     */
    public static void main(String[] args) {
        int giftCard = 500;
        int timesUsed = 3;
        giftCard -=150;

        System.out.println(giftCard);
        timesUsed --;
        giftCard -=99;
        System.out.println(giftCard);
        -- timesUsed;
        System.out.println(timesUsed +" time left"+ " On the amount of " + giftCard);


    }
}
