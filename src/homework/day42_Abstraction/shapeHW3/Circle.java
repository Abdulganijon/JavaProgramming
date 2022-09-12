package homework.day42_Abstraction.shapeHW3;

public class Circle extends Shape {

    public  final double radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area is = " + radius * radius * Math.round(Math.PI));

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is = " + 2*radius*Math.round(Math.PI));

    }

    @Override
    public String toString() {
        String org = super.toString();
        return org.substring(0, org.indexOf("|")) + "| Radius: " + radius + org.substring(org.indexOf("|") - 1);
    }
    /*
    Create a concrete class Circle
    sub class of Sharpe

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius
     */
}
