package homework.day15_String;



public class DigitsLettersSpecialCharsM {
    public static void main(String[] args) {
        String str = "Cydeo12345School! @#$%WoodenSpoon";
        String digits = ""; //12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) { // i; index numbers of str(0~ last index)
            char ch = str.charAt(i); // ch: each characters that we have in str
            if(ch>='0' && ch<= '9'){
                digits+=ch;
                
            }else if(ch >= 'A'  && ch <= 'Z'){
                letters +=ch;
            }else if(ch >= 'a'  && ch <= 'z'){
                letters +=ch;
            }else {
                if (ch != ' ') { // if special character is not a space
                    specialChars += ch;

                }

            }
            
        }
        System.out.println("digits= " + digits);
        System.out.println("letters= " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
