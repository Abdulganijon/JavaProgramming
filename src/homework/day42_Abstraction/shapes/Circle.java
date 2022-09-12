package homework.day42_Abstraction.shapes;

public class Circle extends Shape{
    public int radius;


    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(radius*radius*Math.PI);

    }

    @Override
    public void perimeter() {
        System.out.println(2*radius *Math.PI);

    }
}
