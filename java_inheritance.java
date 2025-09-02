class Book {
    String title;
    String author;
    double price;

// Constructor

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

// Method to display details
    void displayDetails() {
        System.out.println(&quot;Title: &quot; + title);
        System.out.println(&quot;Author: &quot; + author);
        System.out.println(&quot;Price: ₹&quot; + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book(&quot;The Alchemist&quot;, &quot;Paulo Coelho&quot;, 450);
        b1.displayDetails();
    }
}