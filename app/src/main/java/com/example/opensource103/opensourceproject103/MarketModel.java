package com.example.opensource103.opensourceproject103;

public class MarketModel {
    private int resId;
    private String title;
    private String content;

    MarketModel(int resId, String title, String content) {
        this.resId = resId;
        this.title = title;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
