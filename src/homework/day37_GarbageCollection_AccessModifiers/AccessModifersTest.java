package homework.day37_GarbageCollection_AccessModifiers;

public class AccessModifersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateData);//private is not visible outside the class

     AccessModifiers.method1();
     AccessModifiers.method2();
     //AccessModifiers.method3();


    }

}
