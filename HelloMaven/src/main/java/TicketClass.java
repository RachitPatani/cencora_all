import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Ticket
{
    int tid;
    String tname;
    double price;

    public Ticket() {
    }

    public Ticket(int tid, String tname,double price) {
        this.price = price;
        this.tname = tname;
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", price=" + price +
                '}';
    }
}

public class TicketClass {
    public static List<Ticket> getTicket()
    {
        Ticket t1=new Ticket(1,"rachit",400.0);
        Ticket t2=new Ticket(2,"raj",600.0);
        Ticket t3=new Ticket(3,"john",300.0);
        Ticket t4=new Ticket(4,"tom",450.0);
        List<Ticket>ticketList= Arrays.asList(t1,t2,t3,t4);

        return ticketList;
    }
    public static List <Ticket> getTicketname()
    {
        List <Ticket> list =new ArrayList<>();
        list.add(new Ticket(1,"rachit",400.0));
        list.add(new Ticket(2,"raj",600.0));
        list.add(new Ticket(3,"john",300.0));
        list.add(new Ticket(4,"tom",450.0));
        List<Ticket>newlist=list.stream().filter(s->s.tname.startsWith("r")).collect(Collectors.toList());


        return newlist;
    }

    public static void main(String[] args) {
        TicketClass obj= new TicketClass();
        System.out.println(TicketClass.getTicketname());
    }
}
