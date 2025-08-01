package at.ac.fhcampuswien.block03.examples.example04;

import java.io.IOException;

public class Example04_03 {
    /* - declare exception using throws keyword
       - then the caller must either also declare exception
           or put in try/catch block (handle it) */
    public static void main(String[] args) {
        try {
            checkedExample();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkedExample() throws IOException {
        throw new IOException();
    }
}