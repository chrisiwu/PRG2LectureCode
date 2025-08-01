package at.ac.fhcampuswien.block02.exercises.exercise01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SupermarketDiscountTest {
    @Test
    public void no_discount_non_member() {
        double actual = SupermarketDiscount.calculateDiscount(1, false);

        double expected = 0.0;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_25_percent_non_member() {
        double actual = SupermarketDiscount.calculateDiscount(6, false);

        double expected = 0.25;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_33_percent_non_member() {
        double actual = SupermarketDiscount.calculateDiscount(12, false);

        double expected = 0.33;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_50_percent_non_member() {
        double actual = SupermarketDiscount.calculateDiscount(17, false);

        double expected = 0.5;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_5_percent_member() {
        double actual = SupermarketDiscount.calculateDiscount(1, true);

        double expected = 0.05;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_30_percent_member() {
        double actual = SupermarketDiscount.calculateDiscount(6, true);

        double expected = 0.3;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_38_percent_member() {
        double actual = SupermarketDiscount.calculateDiscount(12, true);

        double expected = 0.38;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void discount_55_percent_member() {
        double actual = SupermarketDiscount.calculateDiscount(17, true);

        double expected = 0.55;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void negative_amount_not_valid_non_member() {
        assertThrows(IllegalArgumentException.class, () -> SupermarketDiscount.calculateDiscount(-23, false));
    }

    @Test
    public void amount_greater_than_20_not_valid_non_member() {
        assertThrows(IllegalArgumentException.class, () -> SupermarketDiscount.calculateDiscount(89, false));
    }
}