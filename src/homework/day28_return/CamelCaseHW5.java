package homework.day28_return;

public class CamelCaseHW5 {
    public static void main(String[] args) {
        String camelCase = "JAVA will ruLE tHe wORLd";
        System.out.println(sentence(camelCase));

    }
    public static String sentence(String words){
        words=words.toLowerCase();
        String result = "";
        String[] str = words.split(" "); // {java, will, rule, the, world}
        for (int i = 0; i < str.length; i++) {
            result += (str[i].charAt(0) + "").toUpperCase() + str[i].substring(1);

        }
          return result;
        }


    /*
    Camel Case

create a method that will accept a String, of words separated by spaces,
and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld
     */
}
