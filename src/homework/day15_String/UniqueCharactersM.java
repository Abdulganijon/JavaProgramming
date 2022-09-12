package homework.day15_String;

public class UniqueCharactersM {
    public static void main(String[] args) {
        /*
        input AABCCD
        output BD
         */
        String str = "aaabccc";
        String result = "";

        for(int i =0; i< str.length(); i++){ // i: index number of str ( starting from 0)
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index numbers of the character are same
                result += ch;
        }

        }
        System.out.println(result);

    }
}
