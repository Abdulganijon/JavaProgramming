package homework.day19_ForLoop;

public class EvenOdReplit {
    public static void main(String[] args) {
        int limit = 20;
        int count = 1;
        while (count <= limit) {

            if (count % 2 == 0) {
                System.out.print(count + " ");

            }
            count++;

        }
        System.out.println();


        int back = 0;

        while (back <= limit) {

            if (back % 2 == 1) {
                System.out.print(back + " ");

            }
            back++;


        }
    }
}

