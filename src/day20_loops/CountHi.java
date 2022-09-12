package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        /*
        // String s = "abdoashfdhijsdljfhiiday";
        // Approach1: While loop and delete the first occurence each time
       // int count = 0;

        while(s.contains("hi")){
            count++;
            s.replaceFirst("hi", ""); // replaces the first occurrence

        }
        System.out.println(count);
         */
        // counting how many times hi is in the String
       // String s = "abdoashfdhijsdljfhiiday";
        // Approach1: While loop and delete the first occurence each time
       // int count = 0;


        // approach 2
        String s2= "abdhdgldlhsfhilklfhsfshi";
        int count2 = 0;

        for(int i =0; i< s2.length();i++){
            if(s2.charAt(i)=='h' && s2.charAt(i+1) == 'i') {
                count2++;
            }
        }
        System.out.println(count2);
    }
}
