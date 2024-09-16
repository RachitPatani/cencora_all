package com.pack;
import com.sample.invoice.*;
import com.pack.hello.Hellogreet;
import com.pack.hello.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class MainHello {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("invoice.xml");

       //Hellogreet obj=(Hellogreet) context.getBean("st");
      // obj.disp();
//        Student st=(Student) context.getBean("student");
//        System.out.println(st);
        Invoice obj=(Invoice) context.getBean("invoicebean");
        obj.generateInvoice();
    }
}
