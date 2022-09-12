package homework.ArrayUtilityClassM;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksands", "Olga", "Adam", "Adam", "Cihad", "Cydeo"};

        for (String each : words) { // each
            int count = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) ;
            System.out.println(each);
        }
    }
}

