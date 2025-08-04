package at.ac.fhcampuswien.block04.examples.example05.bad_example;

/* bad example:
   - NotificationManager directly depends on a concrete class SMTPEmailService,
       not an abstraction (EmailService interface)
   - one cannot easily switch to another email service (SendGridEmailService)
       without modifying NotificationManager */
public class NotificationManager {
    private SMTPEmailService emailService;

    public NotificationManager() {
        this.emailService = new SMTPEmailService(); // tightly coupled
    }

    public void send(String message) {
        this.emailService.sendEmail(message);
    }
}