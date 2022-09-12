package day40_inheritance.shape;

import homework.day42_Abstraction.shapes.Rectangle;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.area();
        circle.perimeter();


        System.out.println("------------------");

        Rectangle rec1 = new Rectangle(4, 6);
        rec1.area();
        rec1.perimeter();




    }
}
