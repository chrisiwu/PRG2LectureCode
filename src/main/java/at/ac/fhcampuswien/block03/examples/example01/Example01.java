package at.ac.fhcampuswien.block03.examples.example01;

public class Example01 {
    public static void main(String[] args) {
        // try block must be followed by either catch or finally block

        try {
            int[] myArray = new int[3];
            int myEl = myArray[3];
        } catch (Exception e) {
            System.out.println("Catch block is executed.");
            System.out.println(e);
        }

        try {
            int x = 10 / 0;
        } finally {
            System.out.println("Finally block is executed.");
        }
    }
}