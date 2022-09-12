package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "chrome";
        switch (browser){
            case "chrome" :
                System.out.println("opening google in chrome");
                break;
            case "firefox" :
                System.out.println("opening google in firefox");
                break;
            case "Safari" :
            case "safari" :
                System.out.println("special set up or apple computer");
                System.out.println("opening google in safari");
                break;

            default:
                System.out.println("Opening in chrome by default");
        }




    }
}
