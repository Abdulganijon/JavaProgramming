package day36_Custom_classes.hobby;

import java.util.ArrayList;

public class Activity {
    /*
    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
     */

     /* Hobby activity1=new Hobby("Running");
        System.out.println(activity1);


        Hobby activity2=new Hobby("Swimming",20);
        System.out.println(activity2);*/


    public static void main(String[] args) {

       /* Hobby activity1=new Hobby("Running");
        System.out.println(activity1);


        Hobby activity2=new Hobby("Swimming",20);
        System.out.println(activity2);*/


        Hobby activity3=new Hobby("Jumping",0,true,false);

        Hobby activity4=new Hobby("Golfing",50,true,false);

        Hobby activity5=new Hobby("Video Games",10,false,true);

        Hobby activity6=new Hobby("Basketball",3000,false,true);

        ArrayList<Hobby> AllHobbys = new ArrayList<>();
        AllHobbys.add(activity3);
        AllHobbys.add(activity4);
        AllHobbys.add(activity5);
        AllHobbys.add(activity6);

        System.out.println(AllHobbys);

        System.out.println("-----------------------------------Indoor");

        ArrayList<Hobby> isIndoor = new ArrayList<>(AllHobbys);
        isIndoor.removeIf(p->p.isOutdoor);

        System.out.println(isIndoor);

        System.out.println("------------------------------------Outdoor");

        ArrayList<Hobby> Others = new ArrayList<>(AllHobbys);
        Others.removeIf(p->!p.isOutdoor);

        System.out.println(Others);

        System.out.println("-----------------------------------Cheap Hobbies");

        ArrayList<Hobby> cheapHobbies = new ArrayList<>(AllHobbys);
        cheapHobbies.removeIf(p->p.annualCost>500);

        System.out.println(cheapHobbies);

    }
}

