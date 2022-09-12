package day27_Methods;

public class VotingHW {
    /*
    create a method that will accept an age and determine if the person is eligible to vote.
    Person must be 18 years or older to vote
     */
    public static void main(String[] args) {
        age(2007);

    }
    public static void age(int birthYear){
        int age = 2022-birthYear;
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote, must be at least 18 or older");
        }
    }
}
