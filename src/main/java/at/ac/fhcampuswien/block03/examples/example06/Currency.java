package at.ac.fhcampuswien.block03.examples.example06;

public class Currency {
    private String currencyCode;

    public Currency(String currencyCode) throws InvalidCurrencyException {
        if (currencyCode.equals("USD") || currencyCode.equals("EUR")) {
            this.currencyCode = currencyCode;
        } else {
            throw new InvalidCurrencyException("Currency is not supported yet: " + currencyCode);
        }
    }
}