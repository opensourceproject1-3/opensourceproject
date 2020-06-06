package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductActivity extends AppCompatActivity {

    private static final String TAG_ID = "productID";
    private static final String TAG_NAME = "productName";
    private static final String TAG_PRICE = "productPrice";
    private static final String TAG_IMG = "productImage";
    private static final String TAG_SID = "storeID";
    private static final String TAG_CID = "categoryID";

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> productList;
    ProductData data;
    String storeID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Intent intent = getIntent();
        storeID = intent.getStringExtra("storeID");

        data = ProductData.getData();
        productList = data.getList();

        recyclerView = findViewById(R.id.menu_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ProductAdapter adapter = new ProductAdapter(this);

        for (int i=0; i<productList.size(); i++) {
            String sid = productList.get(i).get(TAG_SID);
            if (storeID.equals(sid)) {
                String id = productList.get(i).get(TAG_ID);
                String name = productList.get(i).get(TAG_NAME);
                int price = Integer.parseInt(productList.get(i).get(TAG_PRICE));
                String img = productList.get(i).get(TAG_IMG);
                String category = productList.get(i).get(TAG_CID);
                adapter.addItem(new ProductModel(id, name, price, img, sid, category));
            }
        }

        recyclerView.setAdapter(adapter);

    }
}
