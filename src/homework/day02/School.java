package homework.day02;

import javax.lang.model.SourceVersion;

public class School {
    /*
    Add a new class School
add main method

declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5

    assign the number of students in each grade

    extra: try to create another variable to find the total number of students in the whole school

    (all double) average gpa, number of school days, number of snow days
     */
    public static void main(String[] args) {
        int grade1, grade2, grade3, grade4, grade5;
        grade1 = 5;
        grade2 = 7;
        grade3 = 9;
        grade4 = 10;
        grade5 = 15;
        int totalNumberOfStudents = grade1 + grade2 + grade3 + grade4 + grade5;
        System.out.println("totalNumberOfStudents = " + totalNumberOfStudents);

        double averageGpa, numberOfSchoolDays, numberOfSnowDays;
        averageGpa = 3.8;
        numberOfSchoolDays = 180.5;
        numberOfSnowDays = 15.3;
        System.out.println("averageGpa = " + averageGpa);
        System.out.println("numberOfSchoolDays = " + numberOfSchoolDays);
        System.out.println("numberOfSnowDays = " + numberOfSnowDays);


    }
}
