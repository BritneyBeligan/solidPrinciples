package solidPrinciples;
// Concrete class implementing OrderPricing
public class OrderPricingAction implements OrderPricing {
    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

}
