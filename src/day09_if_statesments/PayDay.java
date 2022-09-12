package day09_if_statesments;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 42;
        double netPay;

        if (hoursPerWeek > 40) {
            // Overtime calculation

            int overTimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40; // calculate reg pay for 40hours
            netPay += hourlyRate * overTimeHours * 1.5;
            System.out.println("overTimeHours = " + overTimeHours);

        } else {
            // worked under or equal 40 hours
            netPay = hourlyRate * hoursPerWeek;


        }
        System.out.println("Net Pay:" + netPay);
    }
}

