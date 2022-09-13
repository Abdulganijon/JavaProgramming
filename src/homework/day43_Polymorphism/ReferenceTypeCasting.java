package homework.day43_Polymorphism;

import homework.day39_inheritance.AnimalTask.Animal;
import homework.day39_inheritance.AnimalTask.Cat;
import homework.day39_inheritance.AnimalTask.Dog;
import homework.day39_inheritance.employee.Employee;
import homework.day39_inheritance.employee.Tester;
import homework.day42_Abstraction.shape.Circle;
import homework.day42_Abstraction.shape.Shape;
import homework.day42_Abstraction.shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

       // Shape shape = (Shape) new Circle(4); // upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (ChromeDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        // Dog dog = (Dog)animal; // downcasting can be used multiple times
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark(); // downcasting can be used once

        Shape shape1 = new Square(5);
        System.out.println(((Square) shape1).getSide());

        System.out.println("_------------------------------------------------");
        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");
        //  Cat cat= (Cat) animal2;
        // cat.meow();

        ((Cat) animal2).meow(); // opt + enter = Select cast option

        System.out.println("______________________");

        Employee employee= new Tester("Jason",true,135000,true);
        ((Tester)employee).work();





        Shape s1 = new Circle(10);

        s1.area();
        s1.perimeter();
        // ((Cube)  s1).volume(); cube doesnt have is a relationship with circle


    }
}


