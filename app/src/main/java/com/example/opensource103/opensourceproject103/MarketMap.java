package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MarketMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_map);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.map_num);
        textView.setText(String.valueOf(intent.getIntExtra("marketNum", 0)));


    }
}
