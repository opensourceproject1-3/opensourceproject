package com.example.opensource103.opensourceproject103;

public class MarketModel {
    private int resId;
    private String title;
    private String number;

    MarketModel(int resId, String title,String number) {
        this.resId = resId;
        this.title = title;
        this.number = number;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) { this.number = number; }

}
