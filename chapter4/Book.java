package chapter4;

public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book (String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               "Price: $" + String.format("%.2f", price);
    }
}

class BookTest {
    public static void main(String[] args) {
        // Instantiate three Book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Micheal Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book1:");
        System.out.println(book1);
        System.out.println("\nBook2:");
        System.out.println(book2);
        System.out.println("\nBook3:");
        System.out.println(book3);
    }
}