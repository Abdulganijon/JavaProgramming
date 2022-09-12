package day30_practice_wrapper;

public class HTMLGeneratorHW2 {
    public static void main(String[] args) {
        /*
        HTML Generator

Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
         */
        String str = "li^3";         //char
      int n =  Integer.parseInt(""+str.charAt(str.indexOf("^")+1));//^+1=char->Integer

      String s = str.substring(0,str.indexOf("^")); //pllllli

      String toPrint="<"+s+">"+"<"+"/"+s+">";

        for (int i = 0; i <n; i++) { //3
            System.out.print(toPrint);





        }


    }
}
