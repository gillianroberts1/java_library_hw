import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.collection.size();
    }


    public void addBook(Book book1) {
        this.collection.add(book1);
    }

    public boolean hasCapacity() {
        return capacity >collection.size();
    }
}
