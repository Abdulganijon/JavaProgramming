package homework.day43_Polymorphism;

import day40_inheritance.shape.Circle;
import homework.day42_Abstraction.shapes.Square;


public class PolymorphismIntro {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        Integer n1 = 2;

        Boolean b1 = true;

        Double r1 = 5.5;

        Object[] array = {str,n1,b1,r1,new Circle(4), new Square(7)};


    }
}
