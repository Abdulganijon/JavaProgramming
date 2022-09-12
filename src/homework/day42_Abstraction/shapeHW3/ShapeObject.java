package homework.day42_Abstraction.shapeHW3;

public class ShapeObject {
    public static void main(String[] args) {
        Circle obj = new Circle(2);
        System.out.println(obj);

        obj.perimeter();

        Rectangle rec1 = new Rectangle(2,4);
        rec1.area();
        rec1.perimeter();

    }
}
