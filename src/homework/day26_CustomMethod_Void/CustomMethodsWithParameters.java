package homework.day26_CustomMethod_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        // oddOrEven(); // the method demands additional info to complete its task
        oddOrEven(10);
        System.out.println("---------------");
        ageOfPerson(1989);
        System.out.println("---------------");
        printNumbers(100, 200);
    }

    // create a function that can check if a number is odd or even
    public static void oddOrEven(int number){
        if(number %2 == 0){
            System.out.println( number + " is even number");
        }else{
            System.out.println(number + "is odd number");
        }


    }

    // creat a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
      int age = 2022-birthYear;
        System.out.println("Your age is: " + age);
    }
    // create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x+1; i <= y ; i++) {
            System.out.println(i);

        }

    }
}
