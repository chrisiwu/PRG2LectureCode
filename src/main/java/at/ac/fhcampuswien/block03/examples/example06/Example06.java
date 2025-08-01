package at.ac.fhcampuswien.block03.examples.example06;

public class Example06 {
    public static void main(String[] args) {
        try {
            Currency c1 = new Currency("EUR");
            Currency c2 = new Currency("GBP");
        } catch (InvalidCurrencyException e) {
            System.out.println(e.getMessage());
        }
    }
}