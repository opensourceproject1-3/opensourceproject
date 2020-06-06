package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MarketMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_map);

        Intent intent = getIntent();
        int map = intent.getIntExtra("marketNum", 0);

        ImageView imageView = findViewById(R.id.makret_map);

        int mapRes = 0;
        switch (map) {
            case 0:
                mapRes = R.drawable.map1;
                break;
            case 1:
                mapRes = R.drawable.map2;
                break;
        }

        imageView.setImageResource(mapRes);

    }
}
