import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TicketSpec {
    private TicketClass T;
    private List<Ticket> list;

    @BeforeEach
    public  void setup()
    {
        System.out.println("in setup");
    }
    @Test
    public void checkEmpty()
    {
        T=new TicketClass();
        list=TicketClass.getTicket();
        assertFalse(list.isEmpty(),"list is not empty");

    }

    @Test
    public void nameCheck()
    {
        T=new TicketClass();
        list=TicketClass.getTicketname();
        assertEquals(2,list.size(),"wrong");
    }
}
