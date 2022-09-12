package homework.day39_inheritance.discord;

public class Admin extends DiscordUser{

    public Admin(String role, String name, double id) {
        super(role, name, id);
    }
    public void createChannel(){
        System.out.println("Creating new discord channel");
    }
}
