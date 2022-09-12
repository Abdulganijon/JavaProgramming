package homework.day39_inheritance.discord;

public class Student extends DiscordUser{


    public Student(String role, String name, double id) {
        super(role, name, id);
    }
    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
