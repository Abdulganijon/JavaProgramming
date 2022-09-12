package day37_Static;

public class Executions {
    public static void main(String[] args) {
        new Executions();// creating object without reference
        System.out.println(1);
        new Executions();
    }
    public Executions(){
        System.out.println(2);
    }
    static{ // this block
        System.out.println(3);

    }
}
