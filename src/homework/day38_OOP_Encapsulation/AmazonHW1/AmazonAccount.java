package homework.day38_OOP_Encapsulation.AmazonHW1;

public class AmazonAccount {
    /*
    Create a class AmazonAccount

    instance variables:
        - userName (String)
        - email (String)
        - hasPrime (boolean)

    constructor:
        - initialize the fields

    encapsulate AmazonAccount

    methods: toString()

Create a class UseAmazon

    create an object of the AmazonAccount and verify the constructor, getters and setters and toString are working properly
     */

    private String userName;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }
}
