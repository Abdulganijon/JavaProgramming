package homework.day17_loop;



public class LoopFizBuzz {
    public static void main(String[] args) {
        /*
        write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it
        (see previous task from class if you are not sure)
    1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
    2.  For numbers which are divisible by 5, print "Buzz" instead of the number
    3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number
         */

        int number = 1;
        while(number<50){
            number++;
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " fizzBuzz");
            }else if (number % 5 == 0) {
                System.out.println(number + " buzz");
            } else if (number % 3 == 0) {
                System.out.println(number + " fizz");
            }else{
                System.out.println(number);
            }
        }

    }


    public static class FrequencyOfCharacterM {
        public static void main(String[] args) {
            /*
            write a program that can return the frequency of a char from String
            str = "AAABBBC"
            ch = 'A'
             */
            String str = "AAABBBC";

            char ch = 'A';
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // i: indexes of str
                char eachChar = str.charAt(i); // eachChar: each character of str

                if(ch == eachChar){
                    frequency++;
                }
            }
            System.out.println(frequency);
        }
    }
}

