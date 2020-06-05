package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Notice extends AppCompatActivity {

    private ImageButton notice;
    private ImageButton notice2;
    private ImageButton notice3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);

        notice = findViewById(R.id.notice_image);
        notice2 = findViewById(R.id.notice_image2);
        notice3 = findViewById(R.id.notice_image3);

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mafra.go.kr/mafra/367/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGbWFmcmElMkY3MiUyRjMyMjM5OSUyRmFydGNsVmlldy5kbyUzRg%3D%3D"));
                startActivity(intent);
            }
        });

        notice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mnuri.kr/mobile/useOfCard/mobileAgree.do"));
                startActivity(intent);
            }
        });


        notice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ncov.mohw.go.kr/"));
                startActivity(intent);
            }
        });




    }



}

