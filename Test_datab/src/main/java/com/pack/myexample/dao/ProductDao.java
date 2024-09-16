package com.pack.myexample.dao;

import com.pack.myexample.config.ProductConfig;
import com.pack.myexample.model.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDao {
    public void ProductSave(Product pr) {
        Transaction trn = null;
        try {
            Session sess = ProductConfig.getSessionFactory().openSession();
            trn = sess.beginTransaction();
            sess.save(pr);
            trn.commit();
        } catch (Exception e) {
            if (trn != null) {
                trn.rollback();

            }
            e.printStackTrace();
        }
    }

    public List<Product> getProducts() {

        try (Session session = ProductConfig.getSessionFactory().openSession()) {//parallel to sql select query
            return session.createQuery("from Product", Product.class).list();
        }
    }

    public void updateCustomer(Product product) {
        Transaction trns = null;
        Session session = ProductConfig.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(product);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
}
