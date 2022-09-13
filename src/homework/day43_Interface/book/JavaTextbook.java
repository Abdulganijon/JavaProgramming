package homework.day43_Interface.book;

public class JavaTextbook extends EBook{

    boolean isFun;

    @Override
    public void read() {
        System.out.println("Reading EBook");
    }

    @Override
    public void download() {
        System.out.println("Downloading EBook");

    }

    @Override
    void open() {
        System.out.println("Openning EBook");

    }
}
