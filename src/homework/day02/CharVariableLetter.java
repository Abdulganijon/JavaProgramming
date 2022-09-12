package homework.day02;

public class CharVariableLetter {
    public static void main(String[] args) {
        /*
        create a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number A

	ex:
		$
		speical character
         */
        char letter = '$';

        if ((letter >= 65 && letter <= 90)||(letter>=97 && letter<=122)) {
            System.out.println(letter + " is letter");
        } else if (letter >= 48 && letter <= 57) {
            System.out.println(letter + " is a number");
        }else{
            System.out.println(letter + " is a special character");
        }

    }



    }

