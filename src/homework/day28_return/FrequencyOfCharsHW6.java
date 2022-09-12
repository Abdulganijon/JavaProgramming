package homework.day28_return;

public class FrequencyOfCharsHW6 {
    public static void main(String[] args) {
        String word1 = "Mississippi";
        char char1 = 's';
        frequency(word1,char1);
        System.out.println(frequency(word1, char1));
    }
    public static int frequency(String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
       return count;
    }
    /*
    Frequency of Character

create a method that will accept a word(String) and a letter (char) and
return how many times that given letter is found in the given word
Ex:
	Input:
		apple, p
	Output:
		2
Ex:
	Input:
		apple, z
	Output:
		0
Ex:
	Input:
		aabbaacca,
	Output:
		5
     */
}
