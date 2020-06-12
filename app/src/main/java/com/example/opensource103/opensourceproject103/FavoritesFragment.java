package com.example.opensource103.opensourceproject103;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {

    private static final String TAG_ID = "storeID";
    private static final String TAG_NAME = "storeName";
    private static final String TAG_ADD = "storeTime";
    private static final String TAG_CAT = "categoryID";
    private static final String TAG_IMG = "storeImage";

    SharedPreferences sf;
    StoreData data;
    boolean isFavorite;
    ArrayList<HashMap<String, String>> storeList;
    List<String> storeIDList;
    StoreAdapter adapter;

    RecyclerView recyclerView;
    ImageView imageView;


    public FavoritesFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_favorites, container, false);
        sf = rootView.getContext().getSharedPreferences("favoriteFile", Context.MODE_PRIVATE);
        data = StoreData.getData();
        storeList = data.getList();
        storeIDList = new ArrayList<>();
        isFavorite = false;
        imageView = rootView.findViewById(R.id.no_favorites);
        recyclerView = rootView.findViewById(R.id.favorites_recyclerview);

        for (int i=1; i<=storeList.size(); i++) {
            String key = "STORE_" + i;
            String value = sf.getString(key, null);
            if (value != null) {
                storeIDList.add(value);
                isFavorite = true;
            }
        }

        if (isFavorite) {
            imageView.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(rootView.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new StoreAdapter(getContext());

        int index = 0;
        for (int i=0; i<storeList.size(); i++) {
            String key = storeList.get(i).get(TAG_ID);
            for (int j=index; j<storeIDList.size(); j++) {
                if (key.equals(storeIDList.get(j))) {
                    String sc = storeList.get(i).get(TAG_CAT);
                    String sn = storeList.get(i).get(TAG_NAME);
                    String st = storeList.get(i).get(TAG_ADD);
                    String is = sf.getString(key, null);
                    String url = storeList.get(i).get(TAG_IMG);
                    StoreModel sm = new StoreModel(key, sn, st, sc, url);
                    if (is != null) {
                        sm.check = true;
                    }
                    adapter.addItem(sm);
                    index++;
                }
            }
        }

        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}
