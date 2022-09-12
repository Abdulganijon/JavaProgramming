package homework.day20_NestedLoop;

public class DuplicateCharacters {
   /*
    [IQ] Duplicate characters
    Given a String, find and print the duplicate characters.
    A character is duplicate if it appears more than once in the String.

    Ex:
    Input:
    AAABCCDEEF
    Output:
    ACE
    */
   public static void main(String[] args) {
       String str = "AAABCCDEEF";
       String unique = "";

       for (int i = 0; i < str.length(); i++) {
           int count = 0;
           for (int j = 0; j < str.length(); j++) {
               if (str.charAt(i) == str.charAt(j)) {
                   count++;
               }
               if (count > 1 && !unique.contains("" + str.charAt(i))) {// if the counter is 1 the character was only found one time, the character only matched itself
                   unique += str.charAt(i);
               }
           }
       }
       System.out.println(unique);
   }
}

