import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String borrowerName){
        this.name = borrowerName;
        this.collection = new ArrayList<Book>();
    }
    public int bookCount() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        this.collection.add(book);
    }
}
