package at.ac.fhcampuswien.block04.examples.example02.bad_example;

/* bad example:
   - every new payment method forces changes */
public class PaymentProcessor {
    public void pay(String method) {
        if (method.equals("credit")) {
            /* ... */
        } else if (method.equals("paypal")) {
            /* ... */
        }
    }
}