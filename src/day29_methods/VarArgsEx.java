package day29_methods;

public class VarArgsEx {
    public static void main(String[] args) {
        int[] a = {3, 1, 3, 5};
        printALl(a);
        dynamic(4, 1, 4, 1, 5, 2);
    }

    public static void printALl(int[] nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }

    public static void dynamic(int... nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }
}
