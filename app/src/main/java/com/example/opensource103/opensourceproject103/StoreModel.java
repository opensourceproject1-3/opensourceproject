package com.example.opensource103.opensourceproject103;

public class StoreModel {
    String storeID;
    String storeName;
    String storeTime;
    String categoryID;
    String imageUrl;
    boolean check;

    public StoreModel(String storeID, String storeName, String storeTime, String categoryID, String url) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeTime = storeTime;
        this.categoryID = categoryID;
        this.imageUrl = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
}
