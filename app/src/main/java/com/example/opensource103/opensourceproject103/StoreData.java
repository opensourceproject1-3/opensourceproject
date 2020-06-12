package com.example.opensource103.opensourceproject103;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreData {
    private static StoreData data = null;

    ArrayList<HashMap<String, String>> personList;

    private StoreData() {

    }

    public static StoreData getData() {
        if (data == null) {
            data = new StoreData();
            Log.d("TTT", "storedata 생성");
        }
        return data;
    }

    public ArrayList<HashMap<String, String>> getList() {
        return personList;
    }

    public void setList(ArrayList<HashMap<String, String>> list) {
        personList = list;
        Log.d("TTT", personList.size()+"");

    }

}
