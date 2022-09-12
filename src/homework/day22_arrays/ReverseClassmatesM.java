package homework.day22_arrays;

public class ReverseClassmatesM {
    public static void main(String[] args) {
        /*
        create string array, and store the names of your  class mates (10)
         reverse each students names and print them in separate lines
          ex:
          arr = {java, python, c#}
           output:
            avaJ
            nohtyp
             #c
         */

        String[] names = {"java", "python", "c#"};

        String eachName="";

        for (int i = 0; i < names.length; i++) {//java//python//c#
            eachName = names[i];
            String reverseName = "";
            for (int j = eachName.length()-1; j >= 0; j--) {//a//v//a//j
                reverseName += eachName.charAt(j);
            }
            System.out.println(reverseName);
            }

            }
        }



