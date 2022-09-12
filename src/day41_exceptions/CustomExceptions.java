package day41_exceptions;

class FadyException extends RuntimeException{ // unchecked exception
    public FadyException(){
        super("Time for a short break");
    }
    public FadyException(String message){
        super(message);
    }
    class NoBreakException extends Exception{ // custom checked exception

    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        //throw new FadyException("It is time for short break");
         //throw new FadyException(" it is time for a lunch break");

            //throw new NoBreakException();

    }
}
