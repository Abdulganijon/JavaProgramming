package homework.day42_Abstraction.shapes;

public class Rectangle extends Shape{
public int width;
public int length;

    public Rectangle(int width, int length) {
        super( "Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Area is = " + width*length);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is = " + 2*(width*length) );

    }
}
