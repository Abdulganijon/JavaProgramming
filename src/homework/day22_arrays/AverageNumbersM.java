package homework.day22_arrays;

public class AverageNumbersM {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50,60};

        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum+= number[i];
        }
        double averageNumber = sum/number.length;

        System.out.println("averageNumber = " + averageNumber);

    }
}
