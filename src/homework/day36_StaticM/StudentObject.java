package homework.day36_StaticM;

public class StudentObject {
    public static void main(String[] args) {
        Students student1 = new Students("Ahmet");
        Students student2 = new Students("Aygun", 'F');
        Students students3 = new Students("Nigara", 11);
        Students students4 = new Students("Mert", 12, 'A');
        Students student5 = new Students("Cihad", 'M', 28);
        Students student6 = new Students("Alen", 'M', 29, 15);
        Students students7 = new Students("Abdulgani", 'M', 33, 17, 'A');
        System.out.println(student1 == student2);

        Students[] students = {student1,student2,students3,students4,student5,student6,students7};


    }
}
