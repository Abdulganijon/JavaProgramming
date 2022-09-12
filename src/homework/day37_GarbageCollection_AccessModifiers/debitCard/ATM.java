package homework.day37_GarbageCollection_AccessModifiers.debitCard;

public class ATM {
    public static void main(String[] args) {
        DebitCard atm1 = new DebitCard(1234567812345678L, "Alen", 100000);
        System.out.println(atm1);
        DebitCard atm2 = new DebitCard(1234567812345678L, "Gani", "Visa", 4, 1200000);
        System.out.println(atm2);
        atm2.invalidCardNumber();
        atm2.invalidPin();


    }
}
