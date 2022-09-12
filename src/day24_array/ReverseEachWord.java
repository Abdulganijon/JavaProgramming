package day24_array;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good weekend!";

        // revers: weekend! good a have Friday. is Today
        String[] words = str.split(" ");
        String reverse = "";
        for (String each: words){ //goes through one element at a time in the array

            String eachReverse = "";
            for (int i = each.length()-1; i >=0 ; i--) { // reversing a String, from last index to 0
                eachReverse += each.charAt(i);
            }
            reverse+=eachReverse + " ";
            }
        System.out.println(reverse);
        }
    }
    

