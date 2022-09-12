package homework.day28_return;

public class intArrayHW2 {
    public static void main(String[] args) {
        int[]arr= {2, 3, 5, 10, 6, 8};
        System.out.println(sum(arr));
    }
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum

     */
    public static int sum(int[]arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
