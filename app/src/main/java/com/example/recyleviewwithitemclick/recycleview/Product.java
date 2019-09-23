package com.example.recyleviewwithitemclick.recycleview;

public class Product {
    private int productImage;
    private double productPrize;
    private String productName;
    private String productCode;

    public Product() {
    }

    public Product(int productImage, double productPrize, String productName, String productCode) {
        this.productImage = productImage;
        this.productPrize = productPrize;
        this.productName = productName;
        this.productCode = productCode;
    }

    public int getProductImage() {
        return productImage;
    }

    public double getProductPrize() {
        return productPrize;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }
}
