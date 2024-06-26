package solidPrinciples;
// Concrete class implementing Order
public class OrderAction implements Order {
    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
