package homework.day20_NestedLoop;

public class DuplicateCharactersWithAmin {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        // output = ACE
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if(!unique.contains("" + str.charAt(i))){
                unique+="" + str.charAt(i);
                //System.out.println("exists");
            }

        }
        System.out.print(unique);
    }
}
