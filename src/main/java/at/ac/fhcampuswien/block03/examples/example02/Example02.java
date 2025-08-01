package at.ac.fhcampuswien.block03.examples.example02;

public class Example02 {
    public static void main(String[] args) {
        try {
            int[] a = new int[3];
            a[5] = 30 / 0; // 30/2
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Rest of code.");
    }
}