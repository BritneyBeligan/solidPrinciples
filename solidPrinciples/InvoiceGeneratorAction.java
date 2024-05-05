package solidPrinciples;
// Concrete class implementing InvoiceGenerator
public class InvoiceGeneratorAction implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }
}
