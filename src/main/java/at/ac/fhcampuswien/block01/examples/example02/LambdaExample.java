package at.ac.fhcampuswien.block01.examples.example02;

public class LambdaExample {
    public static void main(String[] args) {
        // passing a lambda expression
        MyFunctionalInterface1 myFunctionalInterface1 = () -> System.out.println("Use Lambda.");
        myFunctionalInterface1.doSomething();

        // multiple parameters
        MyFunctionalInterface2 myFunctionalInterface2 = (a, b) -> System.out.println(a + b);
        myFunctionalInterface2.concat("Hello", " world!");

        // the right side after "->" is the function body
        // if the expression needs only one line you can write it without {}
        // if expression consists of multiple lines you have to use brackets
        MyFunctionalInterface1 myFunctionalInterface3 = () -> {
            System.out.println("first line");
            System.out.println("second line");
        };
        myFunctionalInterface3.doSomething();
    }
}