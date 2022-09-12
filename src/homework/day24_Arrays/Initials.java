package homework.day24_Arrays;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"Abdulgani Mirzoev", "Ashraf Mirzoev"};
        for (String each : names) {
            String initials = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);

        }
    }
}
