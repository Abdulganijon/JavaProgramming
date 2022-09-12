package homework.day02;

public class Olympics {
    /*
    Add a new class Olympics
add main method

declare and assign all these variables:
    years: starting at 2022

    use the following data to print this message for the coming years of the Olympics. Reassign the year variable each time

        years - location
        2022 - China
        2024 - France
        2026 - Italy

    message: The Olympics will be in these locations for the coming years: $years
     */
    public static void main(String[] args) {
        System.out.println("Years - Location");

        int year;
        year = 2022;
        String location = "China";
        System.out.println(year+" - " + location);
        year = 2024;
        location = "France";
        System.out.println(year+" - " + location);
        year = 2026;
        location = "Italy";
        System.out.println(year+" - " + location);



    }
}
