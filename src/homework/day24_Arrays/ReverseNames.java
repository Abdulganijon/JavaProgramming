package homework.day24_Arrays;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Abdulgani Mirzoev", "Ashraf Mirzoev"};

        for (String each : names) {
           String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);

        }


    }
}
