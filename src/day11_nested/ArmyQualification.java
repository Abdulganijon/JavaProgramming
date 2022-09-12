package day11_nested;

public class ArmyQualification {
    public static void main(String[] args) {
        int age = 17;
        boolean hasDiploma = true;
        boolean isCitizen = true;

        if ((age >= 18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You qualify for the army");
        }else {
            if(age < 0 || age>120){
                System.out.println("not a valid age number");
            } else if(age<18){
                System.out.println("your need to be at least 18");
            } else {
                System.out.println("you are too old, limit is 35 years old");
            }
            if(!hasDiploma){
                System.out.println("you need at least a high school diploma");
            } if(!isCitizen){
                System.out.println(" You need to be a citizen");
            }
        }
    }
}
