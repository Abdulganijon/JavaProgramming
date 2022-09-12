package homework.day29_Methods;

public class IndexOfOverloadHW5 {
    public static void main(String[] args) {
        String[] arr2 = {"one", "two", "three", "four"};
        String arr3 = "three";
        System.out.println(indexOf(arr2, arr3));

    }
    /*
    IndexOf

overload the indexOf method to work with String array and String element
     */
    public static String indexOf(String[] arr, String str){
        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(str)){
                str1 = arr[i];
                break;
            }
        }
        return str1;
    }
}
