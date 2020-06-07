package com.example.opensource103.opensourceproject103;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MarketFragment extends Fragment {

    private MarketAdapter adapter;
    private RecyclerView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_market, container, false);
        listView = rootView.findViewById(R.id.market_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(layoutManager);
        adapter = new MarketAdapter();

        setData();

        listView.setAdapter(adapter);

        return rootView;
    }

    private  void setData() {
        adapter.addItem(new MarketModel(R.drawable.market_logo, "복대가경시장", "070-4319-5997"));
        adapter.addItem(new MarketModel(R.drawable.market_logo2, "가경터미널시장", "043-232-1117"));
        adapter.addItem(new MarketModel(R.drawable.market_logo3, "육거리종합시장", "043-223-6696"));
        adapter.addItem(new MarketModel(R.drawable.market_logo4, "복대시장", "043-273-6092"));
        adapter.addItem(new MarketModel(R.drawable.market_logo5, "사창시장", "043-270-3701"));
        adapter.addItem(new MarketModel(R.drawable.mini_logo, "육거리전통시장", "043-223-6696"));
        adapter.addItem(new MarketModel(R.drawable.market_logo6, "운천시장", "070-8100-4047"));
        adapter.addItem(new MarketModel(R.drawable.market_logo7, "북부시장", "043-224-8085"));
        adapter.addItem(new MarketModel(R.drawable.market_logo8, "청주평화시장", ""));
        adapter.addItem(new MarketModel(R.drawable.market_logo9, "두꺼비시장", "043-291-4120"));
    }
}
