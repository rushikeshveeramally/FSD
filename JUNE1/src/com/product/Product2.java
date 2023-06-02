package com.product;

public class Product2 {
    double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity){
        return quantity*price;
    }




}
