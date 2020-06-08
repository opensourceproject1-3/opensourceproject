package com.example.opensource103.opensourceproject103;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductReqeust {
    String myJSON;

    private static final String TAG_RESULTS = "result";
    private static final String TAG_ID = "productID";
    private static final String TAG_NAME = "productName";
    private static final String TAG_PRICE = "productPrice";
    private static final String TAG_IMG = "productImage";
    private static final String TAG_SID = "storeID";
    private static final String TAG_CID = "categoryID";
    private static final String TAG_UNIT = "productUnit";

    JSONArray peoples = null;

    ArrayList<HashMap<String, String>> personList;

    public ProductReqeust() {
        personList = new ArrayList<>();
        getData("http://sehwa98.dothome.co.kr/Product.php"); // db url
    }

    protected void showList() {
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            peoples = jsonObj.getJSONArray(TAG_RESULTS);

            for (int i = 0; i < peoples.length(); i++) {
                JSONObject c = peoples.getJSONObject(i);
                String id = c.getString(TAG_ID);
                String name = c.getString(TAG_NAME);
                String price = c.getString(TAG_PRICE);
                String imageUrl = c.getString(TAG_IMG);
                String storeId = c.getString(TAG_SID);
                String category = c.getString(TAG_CID);
                String unit = c.getString(TAG_UNIT);

                HashMap<String, String> persons = new HashMap<>();

                persons.put(TAG_ID, id);
                persons.put(TAG_NAME, name);
                persons.put(TAG_PRICE, price);
                persons.put(TAG_IMG, imageUrl);
                persons.put(TAG_SID, storeId);
                persons.put(TAG_CID, category);
                persons.put(TAG_UNIT, unit);
                personList.add(persons);
            }

            ProductData data = ProductData.getData();
            data.setList(personList);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void getData(String url) {
        class GetDataJSON extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];

                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");
                    }

                    return sb.toString().trim();

                } catch (Exception e) {
                    return null;
                }
            }

            @Override
            protected void onPostExecute(String result) {
                myJSON = result;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }
}
