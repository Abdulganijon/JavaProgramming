package homework.day29_Methods;

public class MaxNumberHW2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 9};
        System.out.println(maxNumber(arr));

    }
    public static int maxNumber(int[] numbers){
        int maxNum = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }
}
