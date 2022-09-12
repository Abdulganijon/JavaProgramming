package day30_practice_wrapper;

public class HW1 {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string
Ex:
    str = "JAVA java";

output:

    true

     */
    public static void main(String[] args) {
        String str = "JAVA java java JAVA";
        int countUp = 0;
        int countLow = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                countUp++; //uppercase
            }if(Character.isLowerCase(str.charAt(i))){
                countLow++;
            }

        }
        if(countUp==countLow){
            System.out.println("True");
         }else{
            System.out.println("False");
        }

    }
}
