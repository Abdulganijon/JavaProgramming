package day37_Static.student;

import day35_custom_class.school.Cydeo;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {
        CydeoStudent.schoolInfo();
        CydeoStudent mayila = new CydeoStudent("Mayila", "Toronto", 2);
        System.out.println(mayila);
        System.out.println(Arrays.toString(mayila.instructors)); // not recomended
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(mayila.myCoffee.amountLeft);
        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);

        CydeoStudent aili = new CydeoStudent("Aili","Ottawa",1);
        System.out.println(aili.myCoffee.amountLeft);
        aili.drink();
        aili.drink();
        aili.drink();
        System.out.println(aili.myCoffee.amountLeft);
    }
}
