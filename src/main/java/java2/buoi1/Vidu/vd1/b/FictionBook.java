package java2.buoi1.Vidu.vd1.b;

import java2.buoi1.Vidu.vd1.a.book;

public class FictionBook extends book {

    public FictionBook(String title, String author, int pages, String description, double price) {
        super(title, author, pages, description, price);
    }

    public void display(){
        System.out.println(super.description);
        System.out.println(super.price);
    }

}
