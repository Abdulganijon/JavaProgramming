package day24_array;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";

        // revers: weekend! good a have Friday. is Today
        String[] words = str.split(" ");
        String reverse = "";

        for(int i=words.length-1; i>=0; i-- ){
            reverse += words[i] + " ";
        }

        System.out.println(reverse.trim());
        System.out.println(reverse);
    }




}
