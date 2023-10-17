import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class LibraryTest {

    private Library library;

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public  void before(){
        library = new Library(3);
        book1 = new Book("Four Steps", "Wendy Hudson", "Thriller");
        book2 = new Book("Pillars of the Earth", "Ken Follet", "History");
        book3 = new Book("Rough Around the Edges", "Crystal Chard", "Romance");

//        library = new Library(3);



    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());

    }

    @Test
    public void checkCapacity(){
        assertEquals(true,library.hasCapacity() );
    }

}
