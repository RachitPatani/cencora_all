import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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

public class UserLogin {
    Map<String ,String> data= new HashMap<>();
    String userName;
    String psw;
    List<String> strings;
    String[] words;
    List<Ticket> book=new ArrayList<>();
    public void book()
    {
        int id;
        System.out.println("enter bus id top book:");
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();

//        for(int i=0;i<strings.size();i++)
//        {
//            if(strings.charAt(0))
//            {
//
//            }
//        }


    }

    UserLogin()
    {

    }

    public UserLogin(String userName, String psw) {
        this.userName = userName;
        this.psw = psw;

    }
    public void goBooking()
    {

        Path path= Paths.get("D:/file.txt");
        try {
           byte [] bs= Files.readAllBytes(path);
            strings=Files.readAllLines(path);
            for(String i:strings)
            {
                words = i.split(",");
            }
//            System.out.println("read btes: \n"+new String(bs));
//            System.out.println("read lines: \n"+strings);
        } catch (IOException e) {
            IOException e1 = e;
            e1.printStackTrace();
        }
        System.out.println("choose 1 search,\n 2 book, \n3Cancel");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        switch (a)
        {
            case  1:
//                search();
                break;
            case 2:
                book();
                break;
            case 3:
//                cancel();
                break;
            default:
                System.out.println("enter vaild option");
        }


    }
    public void checkLogin()
    {
        String usr;
        String pws;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user name: ");
        usr=sc.next();
        System.out.println("enter user password: ");
        pws=sc.next();

        if(data.containsKey(usr)&&pws.equals(data.get(usr)))
        {
            System.out.println("Login Successful");
            goBooking();

        }

    }



    public static void main(String[] args) {

    }
}
