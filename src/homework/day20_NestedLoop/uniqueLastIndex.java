package homework.day20_NestedLoop;

public class uniqueLastIndex {
    /*
    Write a program that can return the index number of the first unique character.
     */
    public static void main(String[] args) {
        String str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.indexOf(str.charAt(i)));
                break;

        }

            }

        }

    }
