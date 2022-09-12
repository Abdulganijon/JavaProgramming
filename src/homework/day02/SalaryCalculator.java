package homework.day02;

public class SalaryCalculator {
    /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal,
     the total tax amount, and your salary after all taxes
     */
    public static void main(String[] args) {
        int salary = 100000;
        double stateTaxRate = 0.095;
        double federalTaxRate = 0.045;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("Total salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }
}
