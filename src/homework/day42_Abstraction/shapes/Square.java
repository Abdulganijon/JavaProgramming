package homework.day42_Abstraction.shapes;

public class Square extends Shape {
    public int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Area: " + side*side);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + 4*side);

    }
}
