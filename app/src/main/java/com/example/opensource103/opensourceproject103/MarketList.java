package com.example.opensource103.opensourceproject103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.res.TypedArray;

public class MarketList extends AppCompatActivity {

    private CustomAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_list);

        adapter = new CustomAdapter();
        listView = (ListView)findViewById(R.id.listView);

        setData();

        listView.setAdapter(adapter);
    }

    // 보통 ListView는 통신을 통해 가져온 데이터를 보여준다.
    // arrResId, titles, contents를 서버에서 가져온 데이터라고 생각하면 된다.
    private  void setData() {
        TypedArray arrResId = getResources().obtainTypedArray(R.array.resId);
        String[] titles = getResources().getStringArray(R.array.title);
        String[] contents = getResources().getStringArray(R.array.content);

        for (int i = 0; i < arrResId.length(); i++) {
            CustomDTO dto = new CustomDTO();
            dto.setResId(arrResId.getResourceId(i, 0));
            dto.setTitle(titles[i]);
            dto.setContent(contents[i]);

            adapter.addItem(dto);
        }
    }
}
