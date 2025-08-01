package at.ac.fhcampuswien.block02.examples.example02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
//    @Test
//    public void test1() {
//    }

//    @Test
//    public void Point_testCalculateDistance1() {
//    }

//    @Test
//    public void calculateDistance_points_same_position_success() {
//    }

    @Test
    public void calculate_distance_points_same_position_is_0() {
        // Given
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        // When
        double actual = p1.calcDistance(p2);

        // Then
        double expected = 0;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void calculate_distance_point2_higher() {
        // Given
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);

        // When
        double actual = p1.calcDistance(p2);

        // Then
        double expected = 1.4142;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void calculate_distance_point1_higher() {
        // Given
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, 1);

        // When
        double actual = p1.calcDistance(p2);

        // Then
        double expected = 1.4142;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void calculate_distance_point1_negativ() {
        // Given
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(1, 1);

        // When
        double actual = p1.calcDistance(p2);

        // Then
        double expected = 2.8284;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void calculate_distance_point2_null() {
        Point p1 = new Point(1, 1);
        Point p2 = null;

        assertThrows(NullPointerException.class, () -> p1.calcDistance(p2));
    }

    @Test
    public void points_are_same_when_same_postion() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);

        assertTrue(p1.compare(p2));
    }

    @Test
    public void points_are_not_same_when_p2_is_higher() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);

        assertFalse(p1.compare(p2));
    }
}