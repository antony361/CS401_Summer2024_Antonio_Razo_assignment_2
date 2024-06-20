import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cart.add(product);
    }

    public void removeProduct(String productId) {
        cart.removeIf(product -> product.getId().equals(productId));
    }

    public void displayCartContents() {
        double totalPrice = 0;
        for (Product product : cart) {
            product.displayProductDetails();
            totalPrice += product.getPrice();
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}
