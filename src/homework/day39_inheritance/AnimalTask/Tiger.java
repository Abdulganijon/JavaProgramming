package homework.day39_inheritance.AnimalTask;

public final class Tiger extends Animal implements WildAnimal{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
    public void roar() {
        System.out.println(name + " is roaring");
    }


    }

