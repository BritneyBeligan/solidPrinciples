package solidPrinciples;
// Concrete class implementing NotificationSender
public class NotificationSenderAction implements NotificationSender {
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}
