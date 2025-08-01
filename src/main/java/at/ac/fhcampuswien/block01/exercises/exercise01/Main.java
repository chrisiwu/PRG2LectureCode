package at.ac.fhcampuswien.block01.exercises.exercise01;

public class Main {
    public static void main(String[] args) {
        // Lambda expression to reverse a string
        MyFunctionalInterface functionalInterface = (string) -> {
            return new StringBuilder(string).reverse().toString();
        };

        // call the method that uses the lambda
        String result = useLambda("Hello, World!", functionalInterface);
        System.out.println(result);
    }

    // function that accepts the functional interface as a parameter
    public static String useLambda(String string, MyFunctionalInterface functionalInterface) {
        return functionalInterface.reverseString(string);
    }
}