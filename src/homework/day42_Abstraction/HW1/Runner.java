package homework.day42_Abstraction.HW1;

public class Runner {
    public static void main(String[] args) {
        Library obj1 = new Library();
        //obj1.getLibraryCard("Fair");

        try {
            obj1.borrow(true);
        } catch (FailToCheckOutException e) {
            e.printStackTrace();
        }


    }





    /*
    Create a class to run the code by calling the methods and seeing the result with different inputs
    to see how the exceptions were related to the execution
     */
}
