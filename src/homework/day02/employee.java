package homework.day02;

public class employee {
    /*
    create a class Employee
create a main method

    declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6,
         based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com.
          Current benefits include $1000000 salary a year, 20 PTO days and work from home.
     */
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite = 'C';
        int employeeId = 007;
        int numberOfPto = 20;
        int salary = 1000000;
        boolean fullTime = true;
        System.out.println("Employment information for " + firstName + " " + lastName + ". " + jobTitle + "for" + companyName + ", based in suite" + suite + ". "
        + "Mr." + lastName + " is full time:" + fullTime + "." + " Contact Mr." + lastName + " at James7@MI6.com." + " Current benefits include " + salary + " salary a year, " + numberOfPto + "PTO days and work from home");




    }
}
