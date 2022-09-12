package homework.day36_StaticM;

public class Students {

    public String name;
    public char gender;
    public int age;
    public int studentId;
    public char grade;

    public Students(String name){
        this.name = name;

    }
    public Students(String name, char gender){
        this(name);
        this.gender = gender;
    }
    public Students(String name, int studentId){
        this(name);
        this.studentId = studentId;
    }
    public Students(String name, int studentId, char grade){
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }
    public Students(String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age=age;
    }
    public Students(String name, char gender, int age, int studentsId){
        this(name,gender,age);
        this. studentId=studentsId;

    }
    public Students(String name, char gender, int age, int studentId, char grade){
        this(name,gender,age, studentId);
        this.grade = grade;
    }
}
