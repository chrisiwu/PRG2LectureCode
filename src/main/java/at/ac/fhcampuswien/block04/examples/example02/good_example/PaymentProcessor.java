package at.ac.fhcampuswien.block04.examples.example02.good_example;

/* Open/Closed Principle:
   - open for extension – closed for modification
   - new functionality can be added to the system
       without changing the existing code
   - prevents situations in which a change
       to one of your classes also requires you
       to adapt all depending classes */

/* good example - open/closed principle:
   - now one can extend the app by adding a new class
       (e.g. GooglePay) instead of changing old code */
public class PaymentProcessor {
    private PaymentMethod method;

    public PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    public void processPayment(double amount) {
        method.pay(amount);
    }
}