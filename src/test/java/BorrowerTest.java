import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Borrower borrower;

    @Before
    public void before() {
        book = new Book("A Thousand Splendid Suns", "Khaled Hosseini", "Domestic Fiction");
        borrower = new Borrower("Gillian");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, borrower.bookCount());
    }
    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }



}
