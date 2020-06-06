package com.example.opensource103.opensourceproject103;

public class ProductModel {
    String productID;
    String productName;
    int productPrice;
    String productImage;
    String storeID;
    String categoryID;

    public ProductModel(String productID, String productName, int productPrice, String productImage, String storeID, String categoryID) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.storeID = storeID;
        this.categoryID = categoryID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
}
