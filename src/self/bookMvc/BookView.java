package self.bookMvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookView {
    public static void main(String[] args) {
        //삽입insert  삭제delete  개별, 전체 조회show
        Book novel = new Book("novel",20000);
        Book poem = new Book("poem",15000);
        Controller controller = new Controller();

        Book addNovel = controller.registerBook(novel);
        System.out.println(addNovel.toString() + " 등록완");
        Book addPoem =controller.registerBook(poem);
        System.out.println(addPoem.toString() + " 등록 완");

        Book deleteNovel = controller.deleteBook(0);
        System.out.println(deleteNovel.getTitle() + " 삭제됨");

        List<Book> allBooks = controller.showAll();
        for( Book b : allBooks){
            System.out.println("전체조회" + allBooks);
        }

    }
}

class Controller{
    Logic logic = new Logic();
    public Book registerBook(Book book){
        Book newBook = logic.insertBook(book);
        return newBook;
    }
    public Book deleteBook(int id){
        Book deleteBook = logic.removeBook(id);
        return deleteBook;
    }
    public Book showOne(int id){
        Book oneBook = logic.findOne(id);
        return oneBook;
    }
    public List<Book> showAll(){
        List<Book> allBooks = logic.findAll();
        return allBooks;
    }

}

class Logic{
    Map<Integer, Book> db = new HashMap<>();
    int id = 0;
    public Book insertBook(Book book){
        db.put(id,book);
        return db.get(id++);
    }
    public Book removeBook(int id){
        return db.remove(id);
    }
    public Book findOne(int id){
        return db.get(id);
    }
    public List<Book> findAll(){
        return new ArrayList<>(db.values());
    }
}
