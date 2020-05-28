package com.example.opensource103.opensourceproject103;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;


/**
 * A simple {@link Fragment} subclass.
 */
public class GPSFragment extends Fragment {

    SupportMapFragment mapFragment;
    GoogleMap map;

    String[] marketList = {"복대가경시장", "가경터미널시장", "육거리종합시장", "복대시장", "사창시장", "육거리전통시장", "운천시장", "북부시장", "청주평화시장", "두꺼비시장"};
    LatLng[] locations = {new LatLng(36.629597, 127.442793), new LatLng(36.628008, 127.435827), new LatLng(36.629256, 127.488305),
            new LatLng(36.635479, 127.448743), new LatLng(36.634342, 127.464149), new LatLng(36.628735, 127.491352),
            new LatLng(36.647432, 127.466472), new LatLng(36.648779, 127.485952), new LatLng(36.655784, 127.482862),
            new LatLng(36.618934, 127.472391)};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_g_p_s, container, false);
    }
}
