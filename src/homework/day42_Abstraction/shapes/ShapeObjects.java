package homework.day42_Abstraction.shapes;

import day40_inheritance.shape.Circle;

public class ShapeObjects {
    public static void main(String[] args) {
        day40_inheritance.shape.Circle circle = new Circle(5);
        System.out.println(circle);
        circle.area();
        circle.perimeter();


        System.out.println("------------------");

        Rectangle rec1 = new Rectangle(4, 6);
        rec1.area();
        rec1.perimeter();

        Square sq1 = new Square(2);
        sq1.area();
        sq1.perimeter();
    }
}
