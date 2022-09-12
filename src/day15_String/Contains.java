package day15_String;

public class Contains {
    public static void main(String[] args) {
        String s = "hello world today";
        System.out.println("word.startsWith(hello wor)" + s.startsWith("hello wor"));

        System.out.println("-------------------------");

        String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today))" + str.contains("today"));
        System.out.println("str.contains(it is))" + str.contains("it is"));
        System.out.println("str.contains(degrees))" + str.contains("degrees"));
        System.out.println("str.contains(it 80)) exact sequence " + str.contains("it 80"));

        System.out.println(str.contains("80") && str.contains("today"));
    }
}
