package day09_if_statesments;

public class Outside {
    public static void main(String[] args) {

        double degrees = 80;

        if(degrees >= 72){
            System.out.println("its nice, go outside");
        }

        if(degrees < 72){
            System.out.println("stay inside, code some java");
        }

        // as if else

        if(degrees >= 72){
            System.out.println("its nice, go outside");
        }else
            System.out.println("stay inside, code some java");
    }
}
