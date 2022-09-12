package day35_custom_class.employeeHW;

public class EmployeeV2 {
    String name;
    double id;
    String jobTitle;
    double salary;

    public EmployeeV2(String name) {
        this.name = name;
    }

    public EmployeeV2(String name, double id) {
        this(name);
        this.id = id;
    }

    public EmployeeV2(String name, double id, String jobTitle) {
        this(name, id); // chain of constructor
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, double id, String jobTitle, double salary) {
        this(name, id, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        String output = "Name: " + name;

        if (id != 0) { //true if the id was initialized
            output += ", id: " + id;

        }
        if (jobTitle != null) {// true if the jobTitle was initialized
            output += ", job title: " + jobTitle;
        }
        if (salary != 0) {
            output += ", Salary: " + salary;
        }
        return output;
    }
}

