package at.ac.fhcampuswien.block02.examples.example04;

public class PostalAddress {
    public static String getState(int zipCode) {
        String numberStr = Integer.toString(zipCode);
        int firstDigit = Character.getNumericValue(numberStr.charAt(0));

        switch (firstDigit) {
            case 1:
                return "Wien";
            default:
                return "";
        }
    }
}