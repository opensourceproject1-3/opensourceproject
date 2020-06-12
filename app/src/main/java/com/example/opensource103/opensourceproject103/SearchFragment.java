package com.example.opensource103.opensourceproject103;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.HashMap;


public class SearchFragment extends Fragment {

    private static final String TAG_ID = "storeID";
    private static final String TAG_NAME = "storeName";
    private static final String TAG_ADD = "storeTime";
    private static final String TAG_CAT = "categoryID";
    private static final String TAG_IMG = "storeImage";

    RecyclerView recyclerView;
    StoreAdapter storeAdapter;
    EditText key;
    ImageButton button;
    StoreData data;
    ArrayList<HashMap<String, String>> storeList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_search, container, false);
        key = rootView.findViewById(R.id.searchInput);
        button = rootView.findViewById(R.id.search);
        data = StoreData.getData();
        storeList = data.personList;
        recyclerView = rootView.findViewById(R.id.search_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeAdapter = new StoreAdapter(getContext());
                setData();
                recyclerView.setAdapter(storeAdapter);
            }
        });

        return rootView;
    }

    private void setData() {
        // 가게명 검색
        for (int i=0; i<storeList.size(); i++) {
            String name = storeList.get(i).get(TAG_NAME);
            if (name.contains(key.getText().toString())) {
                String id = storeList.get(i).get(TAG_ID);
                String category = storeList.get(i).get(TAG_CAT);
                String time = storeList.get(i).get(TAG_ADD);
                String url = storeList.get(i).get(TAG_IMG);
                storeAdapter.addItem(new StoreModel(id, name, time, category, url));
            }
        }
    }
}
