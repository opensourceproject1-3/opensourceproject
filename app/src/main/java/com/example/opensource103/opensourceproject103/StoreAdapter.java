package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {

    ArrayList<StoreModel> items = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item_store, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StoreModel item = items.get(i);
        viewHolder.setItem(item);
    }

    public void addItem(StoreModel item) {
        items.add(item);
    }

    public StoreModel getItem(int i) {
        return items.get(i);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView storeImage;
        TextView storeName;
        TextView storeTime;
        TextView storeCategory;
        RelativeLayout storeContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            storeImage = itemView.findViewById(R.id.store_image);
            storeName = itemView.findViewById(R.id.store_name);
            storeTime = itemView.findViewById(R.id.store_time);
            storeCategory = itemView.findViewById(R.id.store_category);
            storeContainer = itemView.findViewById(R.id.store_container);
        }

        public void setItem(final StoreModel item) {
            storeImage.setImageResource(R.drawable.store);
            storeName.setText(item.getStoreName());
            storeTime.setText("영업시간: " + item.getStoreTime());
            String category = item.getCategoryID();
            if (category.equals("CATEGORY_1")) {
                storeCategory.setText("축산");
            } else if (category.equals("CATEGORY_2")) {
                storeCategory.setText("수산");
            } else if (category.equals("CATEGORY_3")) {
                storeCategory.setText("건어물");
            } else if (category.equals("CATEGORY_4")) {
                storeCategory.setText("청과");
            } else if (category.equals("CATEGORY_5")) {
                storeCategory.setText("견과류");
            } else if (category.equals("CATEGORY_6")) {
                storeCategory.setText("먹거리");
            }
            storeContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ProductActivity.class);
                    intent.putExtra("storeID", item.getStoreID());
                    v.getContext().startActivity(intent);
                }
            });

        }
    }
}