package homework.day38_OOP_Encapsulation.AmazonHW1;

public class AmazonAccountObject {
    public static void main(String[] args) {
        AmazonAccount account1 = new AmazonAccount("Java1", "Java@cydeo.com", true);// access Constructor
        account1.setUserName("Java2"); // access Setter

        AmazonAccount account2 = new AmazonAccount("Java1", "Java@cydeo.com", true);
        account2.setUserName(account2.getUserName().replace("Java1", "Java3")); // access getter

        System.out.println(account1);
        System.out.println(account2);





    }
    }

