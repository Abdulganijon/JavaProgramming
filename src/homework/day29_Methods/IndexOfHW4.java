package homework.day29_Methods;

public class IndexOfHW4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4};
        int number = 2;
        System.out.println(indexOfNumber(array, number));
    }
    /*
    IndexOf

create a method that will accept an int array and an int number.
Find and return the index of the number in the array.
If there is multiple occurrence return the first occurrence's index
     */
public static int indexOfNumber(int[] arr, int num){
    int indexOf = 0;
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i] == num){
            indexOf=i;
            break;
        }
    }
    return indexOf;
    }
}
