package com.example.opensource103.opensourceproject103;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductData {
    private static ProductData data = new ProductData();

    ArrayList<HashMap<String, String>> personList;

    private ProductData() {

    }

    public static ProductData getData() {
        if (data == null) data = new ProductData();
        return data;
    }

    public ArrayList<HashMap<String, String>> getList() {
        return personList;
    }

    public void setList(ArrayList<HashMap<String, String>> list) {
        personList = list;
    }

}
