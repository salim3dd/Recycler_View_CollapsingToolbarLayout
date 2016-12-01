package com.salim3dd.recycler_view_collapsingtoolbarlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView_dAdapter recyclerView_dAdapter;
    public List<List_Item> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.m_RecyclerView);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        listItems = new ArrayList<>();

        listItems.add(new List_Item("جمل", R.drawable.photo_1));
        listItems.add(new List_Item("شجرة", R.drawable.photo_2));
        listItems.add(new List_Item("ركض الخيل", R.drawable.photo_3));
        listItems.add(new List_Item("نوق عرضة", R.drawable.photo_4));
        listItems.add(new List_Item("صراع", R.drawable.photo_5));
        listItems.add(new List_Item("خيمة بدوية", R.drawable.photo_6));
        listItems.add(new List_Item("شياب", R.drawable.photo_7));
        listItems.add(new List_Item("صحراء", R.drawable.photo_8));

        recyclerView_dAdapter = new RecyclerView_dAdapter(listItems, this);
        recyclerView.setAdapter(recyclerView_dAdapter);

    }
}
