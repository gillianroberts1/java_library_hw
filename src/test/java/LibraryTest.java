import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;
    private Library library2;

    private Book book1;
    private Book book2;
    private Book book3;

    private Borrower borrower;

    @Before
    public  void before(){
        library = new Library(2);
        library2 = new Library(4);
        book1 = new Book("Four Steps", "Wendy Hudson", "Thriller");
        book2 = new Book("Pillars of the Earth", "Ken Follet", "History");
        book3 = new Book("Rough Around the Edges", "Crystal Chard", "Romance");

        borrower = new Borrower("Gillian");

    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookIfThereIsCapacity() {
        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.bookCount());

    }
        @Test
        public void cannotAddBookWhenNoCapacity(){
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            assertEquals(2, library.bookCount());

    }

    @Test
    public void checkCapacity(){
        assertEquals(true,library.hasCapacity() );
    }

    @Test
    public void checkBookInStock(){
        library.addBook(book2);
        assertEquals(true, library.checkBookAvailable(book2));
    }

    @Test
    public void canLendBook(){
        library.addBook(book3);
        library.loanBook(book3, borrower);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
        assertEquals(false, library.checkBookAvailable(book3));
    }
    @Test
    public void updateGenreHashmap_whenBookAdded(){
        library2.addBook(book1);
        library2.addBook(book2);
        library2.addBook(book3);
        assertEquals(1, library2.checkGenreFrequency("History"));
        assertEquals(1, library2.checkGenreFrequency("Romance"));


    }



}



