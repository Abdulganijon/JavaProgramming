package homework.day42_Abstraction.shapeHW3;

public class Rectangle extends Shape{
 public int length;
 public int width;


    public Rectangle(int width, int length) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area is = " + width*length);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is = " + 2*(width*length));

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}';
    }
    /*
    Create a concrete class Rectangle
    sub class of Sharpe

    create an instance variable length
    create an instance variable width

    call the parent constructor to set the name of the shape to "Rectangle" & initialize the length and width values for the shape

    implement the two abstract methods for a rectangle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, length, and width
     */

}
