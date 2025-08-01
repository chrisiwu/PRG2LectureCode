package at.ac.fhcampuswien.block03.examples.example05;

import java.io.IOException;

public class Example05_02 {
    /* - in checked exceptions the propagation
           does not happen automatically
       - checked exceptions throw a compilation error –
           they are checked before code execution
       - the throws keyword must be used:
           - throws keyword is used to declare an exception
           - gives an information to the programmer
               that there may occur an exception
               so it is better for the programmer
               to provide the exception handling code
           - with throws keyword the exception is propagated */
    public static void main(String[] args) {
        startDemo();
    }

    private static void startDemo() {
        try {
            function1();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("normal flow ...");
    }

    private static void function1() throws IOException {
        function2();
    }

    private static void function2() throws IOException {
        throw new IOException("some file couldn't be read");
    }
}