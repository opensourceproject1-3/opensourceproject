package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryActivity extends AppCompatActivity {

    TabLayout tabLayout;
    int category;

    RecyclerView recyclerView;
    StoreData data;
    ArrayList<HashMap<String, String>> storeList;

    private static final String TAG_ID = "storeID";
    private static final String TAG_NAME = "storeName";
    private static final String TAG_ADD = "storeTime";
    private static final String TAG_CAT = "categoryID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent = getIntent();
        category = intent.getIntExtra("category", 0);

        data = StoreData.getData();
        storeList = data.getList();

        tabLayout = findViewById(R.id.tabs);

        TabLayout.Tab tab = tabLayout.getTabAt(category);
        tab.select();

        recyclerView = findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        StoreAdapter adapter = new StoreAdapter();

        for (int i=0; i<storeList.size(); i++) {
            int sc = Integer.valueOf(storeList.get(i).get(TAG_CAT));
            if (sc-1 == category) {
                int id = Integer.valueOf(storeList.get(i).get(TAG_ID));
                String sn = storeList.get(i).get(TAG_NAME);
                String st = storeList.get(i).get(TAG_ADD);
                adapter.addItem(new StoreModel(id, sn, st, sc));
            }
        }

        recyclerView.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int category = tab.getPosition();
                StoreAdapter adapter = new StoreAdapter();

                for (int i=0; i<storeList.size(); i++) {
                    int sc = Integer.valueOf(storeList.get(i).get(TAG_CAT));
                    if (sc-1 == category) {
                        int id = Integer.valueOf(storeList.get(i).get(TAG_ID));
                        String sn = storeList.get(i).get(TAG_NAME);
                        String st = storeList.get(i).get(TAG_ADD);
                        adapter.addItem(new StoreModel(id, sn, st, sc));
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