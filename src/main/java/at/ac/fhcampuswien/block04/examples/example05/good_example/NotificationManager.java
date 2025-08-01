package at.ac.fhcampuswien.block04.examples.example05.good_example;

/* Dependency Inversion Principle:
   - high-level modules should not depend on low-level modules
   - depend on abstractions (interfaces) rather than concrete classes
   - it is often applied in combination with other principles,
       such as the Single Responsibility Principle (SRP)
       and the Open-Closed Principle (OCP) */

/* good example:
   - introduce an interface (abstraction) and apply dependency injection
   - now NotificationManager is decoupled from the concrete implementation */
public class NotificationManager {
    private EmailService emailService;

    public NotificationManager(EmailService emailService) {
        this.emailService = emailService;
    }
}