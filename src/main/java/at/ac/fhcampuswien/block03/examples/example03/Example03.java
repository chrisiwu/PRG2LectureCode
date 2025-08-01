package at.ac.fhcampuswien.block03.examples.example03;

public class Example03 {
    public static void main(String[] args) {
        divide(30, 0);
    }

    private static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            // the Java throw keyword is used to explicitly throw an exception
            throw new ArithmeticException("Division by zero.");
        } else {
            return dividend / divisor;
        }
    }
}