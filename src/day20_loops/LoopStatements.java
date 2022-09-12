package day20_loops;

public class LoopStatements {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println(i+ " ");

        }
        System.out.println();
        for (int i = 1; i <=5; i++) {
            if(i==2){
                break;
            }
            System.out.println(i+ " ");
        }


    }
}
