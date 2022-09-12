package homework.day39_inheritance.AnimalTask;

public final class Dog extends Animal implements Playable{


    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age,size,color);

    }
    public void bark(){
        System.out.println(name + "is Barking");

    }
    public void play(){
        System.out.println(name + "is playing");
    }

}
