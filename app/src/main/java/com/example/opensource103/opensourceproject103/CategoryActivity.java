package com.example.opensource103.opensourceproject103;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryActivity extends AppCompatActivity {

    TabLayout tabLayout;
    String category;
    int select;

    RecyclerView recyclerView;
    StoreData data;
    ArrayList<HashMap<String, String>> storeList;
    SharedPreferences sf;

    private static final String TAG_ID = "storeID";
    private static final String TAG_NAME = "storeName";
    private static final String TAG_ADD = "storeTime";
    private static final String TAG_CAT = "categoryID";
    private static final String TAG_IMG = "storeImage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        select = intent.getIntExtra("tab", 0);

        sf = getSharedPreferences("favoriteFile", MODE_PRIVATE);

        data = StoreData.getData();
        storeList = data.getList();

        if (storeList == null) {
            Log.d("TTT", "null");
        }

        tabLayout = findViewById(R.id.tabs);

        TabLayout.Tab tab = tabLayout.getTabAt(select);
        tab.select();

        recyclerView = findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        StoreAdapter adapter = new StoreAdapter(CategoryActivity.this);

        for (int i=0; i<storeList.size(); i++) {
            String sc = storeList.get(i).get(TAG_CAT);
            if (sc.equals(category)) {
                String id = storeList.get(i).get(TAG_ID);
                String is = sf.getString(id, null);
                String sn = storeList.get(i).get(TAG_NAME);
                String st = storeList.get(i).get(TAG_ADD);
                String url = storeList.get(i).get(TAG_IMG);
                Log.d("IMAGE", url);
                StoreModel sm = new StoreModel(id, sn, st, sc, url);
                if (is != null) {
                    sm.check = true;
                }
                adapter.addItem(sm);
            }
        }

        recyclerView.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int select = tab.getPosition();
                StoreAdapter adapter = new StoreAdapter(CategoryActivity.this);

                String category = null;

                switch (select) {
                    case 0:
                        category = "CATEGORY_1";
                        break;
                    case 1:
                        category = "CATEGORY_2";
                        break;
                    case 2:
                        category = "CATEGORY_3";
                        break;
                    case 3:
                        category = "CATEGORY_4";
                        break;
                    case 4:
                        category = "CATEGORY_5";
                        break;
                    case 5:
                        category = "CATEGORY_6";
                        break;
                }

                for (int i=0; i<storeList.size(); i++) {
                    String sc = storeList.get(i).get(TAG_CAT);
                    if (sc.equals(category)) {
                        String id = storeList.get(i).get(TAG_ID);
                        String is = sf.getString(id, null);
                        String sn = storeList.get(i).get(TAG_NAME);
                        String st = storeList.get(i).get(TAG_ADD);
                        String url = storeList.get(i).get(TAG_IMG);
                        StoreModel sm = new StoreModel(id, sn, st, sc, url);
                        if (is != null) {
                            sm.check = true;
                        }
                        adapter.addItem(sm);
                    }
                }

                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}