package homework.day09_IFstatements;

public class CharVariableLetter {
    /*
    create a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number

	ex:
		$
		speical character
     */
    public static void main(String[] args) {
        char letter = '$';


     if(letter >=97 && letter<=122 || letter >=67 && letter <=90){
         System.out.println(" is a letter");
     }else if(letter >=48 && letter<=57){
         System.out.println(" is a number");
     }else{
            System.out.println(" is a special character");
        }
    }
}
