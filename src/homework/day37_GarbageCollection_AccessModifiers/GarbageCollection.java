package homework.day37_GarbageCollection_AccessModifiers;




import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class GarbageCollection {
    public static void main(String[] args) {
       /*
       // int n = null;
       String str = "";

        System.out.println(str.toUpperCase() );
        */
      String str = "Wooden Spoon";
      str = null;
        System.out.println(str);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);
        System.out.println("--------------------------------");









    }



}
