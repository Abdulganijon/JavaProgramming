package day21_NestedLoops;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        String longest = "";
        String each = "";

        for (int i = 0; i < str.length()-1; i++) {
            each+= str.charAt(i); // add the characters at index i so the string each
            if(i==str.length()-2 && str.charAt(i) == str.charAt(i+1)) {
                each += str.charAt(i + 1);
                if (each.length() > longest.length()) {
                    longest = each;
                }
            }
            if(str.charAt(i) != str.charAt(i+1)){ // if the current character is not equal to the next character
                if(each.length()> longest.length()){
                    longest=each; // if you find a longer substring, assign it to the longest variable.

                }
                each = ""; // resetting for the next part
        }


        }

        System.out.println(longest);

    }
}
