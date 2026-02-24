package java2.buoi1.Vidu.vd1.a;

public class book {
    protected String title;
    protected String author;
    protected int pages;
    protected String description;
    protected double price;

    // Constructor 3 tham số
    public book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Constructor 5 tham số
    public book(String title, String author, int pages, String description, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.description = description;
        this.price = price;
    }
}
