package com.example.opensource103.opensourceproject103;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    ArrayList<StoreModel> items = new ArrayList<>();
    static SharedPreferences sf;
    static SharedPreferences.Editor editor;

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
        ImageView favorite;
        RelativeLayout storeContainer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            storeImage = itemView.findViewById(R.id.store_image);
            storeName = itemView.findViewById(R.id.store_name);
            storeTime = itemView.findViewById(R.id.store_time);
            storeCategory = itemView.findViewById(R.id.store_category);
            storeContainer = itemView.findViewById(R.id.store_container);
            favorite = itemView.findViewById(R.id.store_favorite);
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
                    intent.putExtra("storeName", item.getStoreName());
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    v.getContext().startActivity(intent);
                }
            });

            final String storeID = item.getStoreID();
            if (item.check) {
                favorite.setImageResource(R.drawable.star_selected);
            }

            favorite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // storeID를 로컬 db에 저장을하면 됨
                    sf = v.getContext().getSharedPreferences("favoriteFile", Context.MODE_PRIVATE);

                    String key = sf.getString(storeID, null);

                    if (key != null )
                        Log.d("StoreAdapter", key);
                    editor = sf.edit();

                    if (key == null) {
                        editor.putString(storeID, storeID);
                        editor.commit();
                        favorite.setImageResource(R.drawable.star_selected);
                        // 즐겨찾기 로컬 db 저장
                        Toast.makeText(v.getContext(), "즐겨찾기 등록!", Toast.LENGTH_SHORT).show();


                    } else {
                        // key가 존재한다면 삭제
                        editor.remove(key);
                        editor.commit();
                        favorite.setImageResource(R.drawable.star_unselected);
                        Toast.makeText(v.getContext(), "즐겨찾기 삭제!", Toast.LENGTH_SHORT).show();

                    }
                }
            });

        }
    }

}
