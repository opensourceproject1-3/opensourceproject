package com.example.opensource103.opensourceproject103;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;


/**
 * A simple {@link Fragment} subclass.
 */
public class MarketFragment extends Fragment {

    private CustomAdapter adapter;
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_market, container, false);
        listView = rootView.findViewById(R.id.makert_listview);
        adapter = new CustomAdapter();

        setData();

        listView.setAdapter(adapter);

        return rootView;
    }

    private  void setData() {
        adapter.addItem(new CustomDTO(R.drawable.market_logo, "복대가경시장", "복대가경시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo2, "가경터미널시장", "가경터미널시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo3, "육거리종합시장", "육거리종합시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo4, "복대시장", "복대시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo5, "사창시장", "사창시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.mini_logo, "육거리전통시장", "육거리전통시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo6, "운천시장", "운천시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo7, "북부시장", "북부시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo8, "청주평화시장", "청주평화시장입니다."));
        adapter.addItem(new CustomDTO(R.drawable.market_logo9, "두꺼비시장", "두꺼비시장입니다."));
    }
}
