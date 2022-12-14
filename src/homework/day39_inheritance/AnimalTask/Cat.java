package homework.day39_inheritance.AnimalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }
    public void scratch() {
        System.out.println(name + " is scratching");
    }
    public void play(){
        System.out.println(name + "is playing ");
    }
}
