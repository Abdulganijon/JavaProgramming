package homework.day22_arrays;

public class MinNumberOfArrayM {
    public static void main(String[] args) {
        int[] number = {10, 5, 2, 1, 7};
        int min = number[0]; //10

        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){
                min = number[i];

            }
        }
        System.out.println(min);
    }
}
