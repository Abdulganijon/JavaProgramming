package homework.day24_Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */

        String[] word = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String isPalindrome = "";
        String longestPalindrome = "";

        for(String each:word){
            String reverse = "";
            for (int i =each.length()-1; i >=0 ; i--) {
                reverse+= each.charAt(i);
            }
               if(each.equalsIgnoreCase(reverse)){
                   isPalindrome += each + " ";//racecar anna mom

                   if(each.length()>longestPalindrome.length()){
                       longestPalindrome =each;
                   }
            }
        }
        System.out.println("Palindrome words: "+isPalindrome);
        System.out.println("Largest palindrome: "+longestPalindrome);
    }

}