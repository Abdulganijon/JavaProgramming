package day43_abstraction_interface.language;

public class English implements Language{

    @Override
    public void hello() {
        System.out.println("hello");

    }

    @Override
    public void bye() {
        System.out.println("Bye");

    }
}
