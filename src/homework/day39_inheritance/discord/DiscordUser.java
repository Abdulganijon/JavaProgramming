package homework.day39_inheritance.discord;

public class DiscordUser {
    public String role;
    public String name;
    public double id;

    public DiscordUser(String role, String name, double id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
