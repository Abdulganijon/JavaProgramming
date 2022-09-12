package day37_Static.school;

import day37_Static.school.School;

public class District {
    public static void main(String[] args) {
        School.district = 149;
        School.totalTeachers = 20;
        School.totalStudents = 200;

        School.totalTeachers--;
        System.out.println(School.district);
        System.out.println(School.totalTeachers);
        System.out.println(School.totalStudents);
        School.announcement();
         School middle = new School();
         middle.lunchTime = 12;
        middle.lunch();
        middle.totalStudents = 5000;
        System.out.println(School.totalStudents);


    }
}
