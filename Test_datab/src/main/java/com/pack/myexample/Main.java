package com.pack.myexample;

import com.pack.myexample.config.ProductConfig;

import com.pack.myexample.dao.ProductDao;

import com.pack.myexample.model.Product;

import org.hibernate.Session;

import org.hibernate.Transaction;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        ProductDao prdao=new ProductDao();

        Product pr=new Product("Pen", 34.45);

        prdao.ProductSave(pr);


         List<Product> prods=prdao.getProducts();

        prods.forEach(p->System.out.println(p));




    }

}

