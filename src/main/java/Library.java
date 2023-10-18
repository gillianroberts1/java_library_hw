import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> genreHashmap;

    public Library(int capacity){
        this.collection = new ArrayList<>();
        this.capacity = capacity;
        this.genreHashmap = new HashMap<>();
    }

    public int bookCount(){
        return this.collection.size();
    }


    public void addBook(Book book1) {
        if(hasCapacity()){
            this.collection.add(book1);
            this.addToGenreHashmap(book1);
        }
    }

    private void addToGenreHashmap(Book book1) {
        String genre = book1.getGenre();
        if(this.genreHashmap.containsKey(genre)){
            int counter = genreHashmap.get(genre);
            counter++;

            this.genreHashmap.put(genre, counter);
        } else{
            this.genreHashmap.put(genre, 1);
        }
    }


    public boolean hasCapacity() {
        return capacity >collection.size();
    }

    public int getCapacity(){
        return capacity;
    }


    public boolean checkBookAvailable(Book book2) {
        for(Book individualBook:this.collection){
            if(individualBook == book2){
                return true;
            }
        }
        return false;
    }


    public void loanBook(Book book3, Borrower borrower) {
        if(this.collection.contains(book3)){
            this.collection.remove(book3);
            borrower.addBook(book3);
        }
    }

    public int checkGenreFrequency(String genre) {
        return this.genreHashmap.get(genre);
    }
}
