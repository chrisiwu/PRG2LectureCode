package at.ac.fhcampuswien.block03.examples.example06;

/* - Java custom exceptions are used
       to customize the exception according
       to user needs (e.g. when others are using your API)
   - you must extend Exception class */
public class InvalidCurrencyException extends Exception {
    public InvalidCurrencyException() {
        super("This currency is not supported.");
    }

    public InvalidCurrencyException(String message) {
        super(message);
    }
}