package homework.day20_NestedLoop;

public class Square {
    public static void main(String[] args) {
        /*
        Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
         */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
