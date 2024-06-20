public class ECommerceApp {
    public static void main(String[] args) {
        // Create instances of products
        Book book1 = new Book("B001", "The Great Gatsby", 10.99, "F. Scott Fitzgerald", "Classic");
        Electronics electronics1 = new Electronics("E001", "iPhone 15", 899.99, "Apple", 24);
        Clothing clothing1 = new Clothing("C001", "T-Shirt", 19.99, "L", "Silk");

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(book1);
        cart.addProduct(electronics1);
        cart.addProduct(clothing1);

        // Display cart contents
        cart.displayCartContents();

        // Remove a product from the cart
        cart.removeProduct("E001");

        // Display cart contents after removal
        cart.displayCartContents();
    }
}
