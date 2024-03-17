package self.part4;

import self.model.Book;

import java.util.ArrayList;

public class BookListExample {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<Book>();
        book.add(new Book("book1",10000));
        book.add(new Book("book2",20000));

        System.out.println();
        for (Book b: book) {
            System.out.println(b);
        }

        String searchTitle = "book1";

        for (Book b: book) {
            if(b.getTitle().equals(searchTitle))
                System.out.println(b.getTitle());
            break;

        }

        int searchPrice = 20000;
        for (Book b: book) {
            if(b.getPrice() == searchPrice)
                System.out.println(b.getPrice());
        }
    }
}
