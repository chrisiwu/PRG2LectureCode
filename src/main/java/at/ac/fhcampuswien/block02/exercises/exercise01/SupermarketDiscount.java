package at.ac.fhcampuswien.block02.exercises.exercise01;

public class SupermarketDiscount {
    public static double calculateDiscount(int amount, boolean member) {
        double discount = 0.0;

        // determine the base discount based on the amount
        if (amount < 0 || amount > 20) {
            throw new IllegalArgumentException("Amount not valid.");
        } else if (amount <= 4) {
            discount = 0.0;
        } else if (amount <= 7) {
            discount = 0.25;
        } else if (amount <= 12) {
            discount = 0.33;
        } else if (amount <= 20) {
            discount = 0.50;
        }

        // add extra discount for members
        if (member) {
            discount += 0.05;
        }

        return discount;
    }
}