package collection;

import java.awt.print.Book;
import java.util.ArrayList;

public class Quiz3 {
    public static void main(String[] args) {
        ArrayList<Book1> book1ArrayList= new ArrayList<>();
        Book1 book1 = new Book1("개미","aaa",4999);
        Book1 book2 = new Book1("나무","bbb",7888);

        book1ArrayList.add(book1);
        book1ArrayList.add(book2);

        for(Book1 a : book1ArrayList){
            System.out.println(a.title+" "+a.author+" "+a.price);
        }

    }
}

class Book1{
    String title;
    String author;
    int price;

    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
