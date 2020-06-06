package com.example.opensource103.opensourceproject103;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreData {
    private static StoreData data = new StoreData();

    ArrayList<HashMap<String, String>> personList;

    private StoreData() {

    }

    public static StoreData getData() {
        if (data == null) data = new StoreData();
        return data;
    }

    public ArrayList<HashMap<String, String>> getList() {
        return personList;
    }

    public void setList(ArrayList<HashMap<String, String>> list) {
        personList = list;
    }

}
