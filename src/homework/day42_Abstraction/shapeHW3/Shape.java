package homework.day42_Abstraction.shapeHW3;

public abstract class Shape {


    public final String name;

    protected Shape(String name) {
        this.name = name;
    }
    public abstract void area();
    public abstract void perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    /*

Create an abstract class Shape

    define a final variable name

    define a constructor to initialize the name of the shape

    define two abstract methods:

        area()
        perimeter()

    override the toString to return the name, area and perimeter
     */
}
