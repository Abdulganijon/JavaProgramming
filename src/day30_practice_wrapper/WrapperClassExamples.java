package day30_practice_wrapper;

public class WrapperClassExamples {
    public static void main(String[] args) {
        byte b=9;
        Byte b2 = 23;

        Character c = 'j';
        System.out.println(c);

        int i = 4;
        Integer i2 = i; // autoboxing
        System.out.println(i2);
        Integer i3 = 32;
        int i4 = 13; // inboxing

        Integer i5 = new Integer(10); // older way
        Integer i6 = 10;


    }


}
