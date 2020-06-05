package com.example.opensource103.opensourceproject103;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pedro.library.AutoPermissions;
import com.pedro.library.AutoPermissionsListener;

import org.jetbrains.annotations.NotNull;

public class SurroundingMarket extends AppCompatActivity implements GoogleMap.OnMarkerClickListener {

    SupportMapFragment mapFragment;
    GoogleMap map;

    String[] marketList = {"복대가경시장", "가경터미널시장", "육거리종합시장", "복대시장", "사창시장", "육거리전통시장", "운천시장", "북부시장", "청주평화시장", "두꺼비시장"};
    LatLng[] locations = {new LatLng(36.629597, 127.442793), new LatLng(36.628008, 127.435827), new LatLng(36.629256, 127.488305),
            new LatLng(36.635479, 127.448743), new LatLng(36.634342, 127.464149), new LatLng(36.628735, 127.491352),
            new LatLng(36.647432, 127.466472), new LatLng(36.648779, 127.485952), new LatLng(36.655784, 127.482862),
            new LatLng(36.618934, 127.472391)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surrounding_market);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                map = googleMap;
                map.setOnMarkerClickListener(SurroundingMarket.this);
                showMarketLocation();
            }
        });

        try {
            MapsInitializer.initialize(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        startLocationService();

    }

    private void startLocationService() {
        LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        try {
            Location location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (location != null) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
            }

            GPSListener gpsListener = new GPSListener();
            long minTime = 10000;
            float minDistance = 0;

            manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, minDistance, gpsListener);
            Toast.makeText(this, "위치확인 요청", Toast.LENGTH_SHORT).show();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    private void showCurrentLocation(Double latitude, Double longitude) {
        LatLng curPoint = new LatLng(latitude, longitude);
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(curPoint, 15));
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("내 위치");
        markerOptions.position(curPoint);
        map.addMarker(markerOptions);
    }

    private void showMarketLocation() {
        for (int i=0; i<marketList.length; i++) {
            LatLng loc = locations[i];
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.title(marketList[i]);
            markerOptions.position(loc);
            markerOptions.snippet("설명");

            BitmapDrawable bitmap = (BitmapDrawable) getResources().getDrawable(R.drawable.market_location);
            Bitmap b = bitmap.getBitmap();
            Bitmap marketMarker = Bitmap.createScaledBitmap(b, 100, 100, false);
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(marketMarker));
            map.addMarker(markerOptions);
        }
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Toast.makeText(this,  marker.getId() + marker.getPosition(), Toast.LENGTH_SHORT).show();
        return false;
    }

    class GPSListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            Double latitude = location.getLatitude();
            Double longitude = location.getLongitude();
            showCurrentLocation(latitude, longitude);
            // showMarketLocation();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }

}
