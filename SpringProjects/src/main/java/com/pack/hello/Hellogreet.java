package com.pack.hello;

public class Hellogreet {
    private String msg;
    private int num ;

    public  Hellogreet(String ab) {
        this.msg=ab;
    }
    public  Hellogreet(int a) {
    this.num=a;
            }

    public Hellogreet(int a,String msg) {
        this.num =a;
        this.msg = msg;
    }


   public void disp()
    {
        System.out.println("Number:"+num);
        System.out.println("Message:"+msg);

    }
}
