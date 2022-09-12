package homework.day28_return;

public class CurrencyConverterHW3 {
    public static void main(String[] args) {

        System.out.println(convert("euro", 100));

    }
    public static double convert (String currency, double dollar){

       switch(currency.toLowerCase()){
           case "euro":
               dollar *= 0.91;
               break;
           case "yen":
               dollar *= 121.03;
               break;
           case "lire":
               dollar *= 14.85;
               break;
           case "won":
               dollar *= 1217.52;
               break;
           case "rupee":
               dollar *= 181.45;
               break;

           default:
               dollar = -1;

      }
        return dollar;
    }
    /*
    Currency Converter

create a method that will accept a currency type(String) and
a currency amount (double)[as dollars] and convert the currency from dollars to a different type

Use the following information to convert from given dollars to the desired currency type

1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on method
Ex:
	Input:
		euro, 100

	Output:
		91

Ex:
	Input:
		yen, 50

	Output:
		6051.5
     */
}
