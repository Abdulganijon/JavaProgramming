package homework.day29_Methods;

public class MinNumberHW1 {
    /*
    create a method that will accept an int array and return the smallest number from the array
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(minNumber(arr));

    }
    public static int minNumber(int[] numbers){
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<minNum){
                minNum=numbers[i];
            }

        }
        return minNum;
    }
}
