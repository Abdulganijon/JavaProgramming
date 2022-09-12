package day34_Custom_classes.rectangle;

public class Final_Rectangle {
    public static void main(String[] args) {
        Rectangle rctgle  = new Rectangle();

        rctgle.base = 10;
        rctgle.height = 5;
        rctgle.calculatePerimeter();
        rctgle.calculateArea();

        System.out.println(rctgle);



    }
}
