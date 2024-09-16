import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Bookspec {
    @BeforeEach
    public void before()
    {
        System.out.println("start ");

    }
    @Test
    public void booksEmptyCheck()
    {
        Books book= new Books();
        List<String> list=book.getBooks();
        assertFalse(list.isEmpty(),()->"books should not be empty");
    }

    @AfterEach
    public void after()
    {
        System.out.println("end ");

    }


}
