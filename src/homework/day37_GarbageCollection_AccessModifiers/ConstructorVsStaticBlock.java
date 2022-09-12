package homework.day37_GarbageCollection_AccessModifiers;

public class ConstructorVsStaticBlock {

    static{
        System.out.println("Static Block");
    }
    public ConstructorVsStaticBlock(){
        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
    }
}
