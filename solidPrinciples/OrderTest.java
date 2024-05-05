package solidPrinciples;
//main
public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.placeOrder("John Doe", "123 Main St");

        OrderPricing pricing = new OrderPricingAction();
        pricing.calculateTotal(10.0, 2);

        // These methods might not be needed for all orders
        InvoiceGenerator invoiceGenerator = new InvoiceGeneratorAction();
        invoiceGenerator.generateInvoice("order_123.pdf");

        NotificationSender notificationSender = new NotificationSenderAction();
        notificationSender.sendEmailNotification("johndoe@example.com");
    }
}
