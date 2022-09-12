package homework.Replits_loops;

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int wordJava=0;
        int wordPython =0;

        for(int i=0; i< sentence.length()-4;i++){
           if(sentence.substring(i, i+4).equals("java")){
               wordJava++;
            }
        }
        System.out.println(wordJava);
        for(int j=0; j< sentence.length()-5;j++){
            if(sentence.substring(j,j+6).equals("python")){
                wordPython++;
            }
        }
        System.out.println(wordPython);
        if(wordJava == wordPython){
            System.out.println("true");
        }else{
            System.out.println("false");
    }

    }
}


