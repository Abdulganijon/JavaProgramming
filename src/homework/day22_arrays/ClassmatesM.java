package homework.day22_arrays;

public class ClassmatesM {
    public static void main(String[] args) {
        /*
        create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
         */
        String[] names = {"James Bond", "Harry Poter", "Van Damm"};
        String initials="";
        for (int i = 0; i < names.length; i++) {   // Letter given after the space(space divides first and last name)
            initials = names[i].substring(0, 1) + names[i].substring((names[i].indexOf(" ") + 1), (names[i].indexOf(" ") + 2)); // ending point after Second initial
                      // First letter from name
            System.out.println(initials);
        }
    }
    }

