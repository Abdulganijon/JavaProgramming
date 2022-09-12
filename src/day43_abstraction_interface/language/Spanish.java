package day43_abstraction_interface.language;

public class Spanish implements Language{


    @Override
    public void hello() {
        System.out.println("Holla");

    }

    @Override
    public void bye() {
        System.out.println("Adios");

    }
}
