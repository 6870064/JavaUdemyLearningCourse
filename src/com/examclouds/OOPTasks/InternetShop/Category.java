package com.examclouds.OOPTasks.InternetShop;

import java.util.Arrays;

public class Category {
    String categoryName;
    Product[] products;

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
