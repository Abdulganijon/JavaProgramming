package homework.day15_String;

public class RemovingDuplicatesM {
    public static void main(String[] args) {
        /*
        input : AABBCCBC
        output:ABC
         */
        String str = "aabbcc";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) { // i: represents the all index numbers of str(start from 0)
            String ch = "" + str.charAt(i);
            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch;

            }

        }
        System.out.println(result);
    }
}

