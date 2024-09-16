import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListdemo {
    LinkedList<Integer> blist=new LinkedList<>();
    LinkedList<Integer> wlist=new LinkedList<>();
    LinkedList<Integer> clist=new LinkedList<>();
    public void addlist()
    {
        blist.add(1);
        blist.add(2);
        blist.add(3);
        blist.add(4);
        wlist.add(5);
        wlist.add(6);
        wlist.add(7);
    }
    public  void cancel()
    {
        int a,b;
        System.out.println("enter element you want to cancle");
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b=blist.indexOf(a);
        clist.add(blist.get(b));
        blist.remove(b);
        blist.add(b, wlist.getFirst());
        wlist.pop();
    }
    public void disp()
    {
        System.out.println("blist");
        System.out.println(blist);
        System.out.println("clist");
        System.out.println(clist);
        System.out.println("wlist");
        System.out.println(wlist);

    }

    public static void main(String[] args) {


        LinkedListdemo obj=new LinkedListdemo();
        obj.addlist();
        obj.disp();
        obj.cancel();
        obj.disp();
        obj.cancel();
        obj.disp();



    }
}
