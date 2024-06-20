public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String id, String name, double price, String brand, int warrantyPeriod) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Brand: " + brand + ", Warranty Period: " + warrantyPeriod + " months");
    }
}
