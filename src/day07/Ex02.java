package day07;

public class Ex02 {
    public static void main(String[] args) {
        Novel harry = new Novel("noveltitle",20202);
        harry.printInformation();
        System.out.println();
        Comic cm = new Comic("spiderman",4343,"fantasy");
        cm.printInformation();
    }
}


class Book{
    String title;
    int price;

    public Book (String title,int price){
        this.title = title;
        this.price = price;
    }

    void printInformation(){
        System.out.println("title"+title );
        System.out.println("price"+ price);
    }
}
class Novel extends Book{
    String genre;

    public Novel(String title, int price) {
        super(title, price);
    }
}

class Comic extends Book{
    String genre;
   public Comic(String title, int price,String genre){
        super("title",2389);
       this.genre = genre;

    }

}
