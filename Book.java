public class Book extends Product {
    private String author;
    private String genre;

    public Book(String id, String name, double price, String author, String genre) {
        super(id, name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Author: " + author + ", Genre: " + genre);
    }
}
