package com.example.opensource103.opensourceproject103;

public class StoreModel {
    int storeID;
    String storeName;
    String storeTime;
    int categoryID;

    public StoreModel(int storeID, String storeName, String storeTime, int categoryID) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeTime = storeTime;
        this.categoryID = categoryID;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
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

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

}
