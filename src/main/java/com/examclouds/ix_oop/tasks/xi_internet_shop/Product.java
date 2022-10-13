package com.examclouds.ix_oop.tasks.xi_internet_shop;

public class Product {
    private String productTitle;
    private int productPrice;
    private double productRating;

    public Product(String productTitle, int productPrice, double productRating) {
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }


    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productTitle='" + productTitle + '\'' +
                ", productPrice=" + productPrice +
                ", productRating=" + productRating +
                '}';
    }
}
