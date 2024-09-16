package com.sample.invoice;

public class Invoice {
    private Product product;

    public Invoice(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public  void  generateInvoice()
    {
        System.out.println("invoice generated:");
        System.out.println(product);
    }
}

