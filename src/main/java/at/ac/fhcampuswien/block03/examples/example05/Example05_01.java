package at.ac.fhcampuswien.block03.examples.example05;

public class Example05_01 {
    /* - unchecked exceptions are propagated automatically
       - an unchecked exception is first thrown
           from the top of the stack
           and if it is not caught,
           it drops down the call stack
           to the previous method */
    public static void main(String[] args) {
        startDemo();
    }

    private static void startDemo() {
        System.out.println("inside startDemo");

        try {
            function1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void function1() {
        System.out.println("inside function1");

        function2();
    }

    private static void function2() {
        System.out.println("inside function2");

        throw new NullPointerException("Thrown nullpointer in function2.");
    }
}