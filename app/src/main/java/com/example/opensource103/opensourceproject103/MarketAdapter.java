package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MarketAdapter extends RecyclerView.Adapter<MarketAdapter.ViewHolder> {

    ArrayList<MarketModel> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_market, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        MarketModel item = items.get(i);
        viewHolder.setItem(item);
        (viewHolder.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MarketMap.class);
                intent.putExtra("marketNum", i);
                v.getContext().startActivity(intent);
            }
        });
    }

    public void addItem(MarketModel item) {
        items.add(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView number;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.market_image);
            title = itemView.findViewById(R.id.text_title);
            number = itemView.findViewById(R.id.text_number);
            button = itemView.findViewById(R.id.watch_map);
        }

        public void setItem(MarketModel item) {
            imageView.setImageResource(item.getResId());
            title.setText(item.getTitle());
            number.setText(item.getNumber());
        }
    }
}
