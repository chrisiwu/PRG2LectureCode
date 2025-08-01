package at.ac.fhcampuswien.block03.examples.example04;

import java.io.IOException;

public class Example04_02 {
    /* - declare exception using throws keyword
       - then the caller must either also declare exception
           or put in try/catch block (handle it) */
    public static void main(String[] args) throws IOException {
        checkedExample();
    }

    private static void checkedExample() throws IOException {
        throw new IOException();
    }
}