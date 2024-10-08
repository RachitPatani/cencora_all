package com.sample.invoice;

public class Product {
    private String item;
    private String price;
    private String address;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
