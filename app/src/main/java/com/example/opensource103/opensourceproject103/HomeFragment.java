package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HomeFragment extends Fragment{

    Button button;
    ImageButton button1, button2, button3, button4, button5, button6;

    ViewFlipper viewFlipper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        int images[] = {
          R.drawable.notice2,
          R.drawable.notice3,
          R.drawable.notice4
        };

        button1 = rootView.findViewById(R.id.imageButton);
        button2 = rootView.findViewById(R.id.imageButton2);
        button3 = rootView.findViewById(R.id.imageButton3);
        button4 = rootView.findViewById(R.id.imageButton4);
        button5 = rootView.findViewById(R.id.imageButton5);
        button6 = rootView.findViewById(R.id.imageButton6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 0);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 1);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 2);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 3);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 4);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryActivity.class);
                intent.putExtra("category", 5);
                startActivity(intent);
            }
        });

        button = rootView.findViewById(R.id.activity_main_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SurroundingMarket.class);
                startActivity(intent);
            }
        });

        viewFlipper = rootView.findViewById(R.id.image_slide);
        viewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Notice.class);
                startActivity(intent);
            }
        });

        for (int image : images) {
            flipperImages(image);
        }

        return rootView;
    }

    private void flipperImages(int image) {
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
    }
}
