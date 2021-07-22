package com.example.test7viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.test7viewpager.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager2 myViewPager2;
    com.example.test7viewpager.adapter.MyAdapter MyAdapter;
    private ArrayList<String> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myViewPager2 = findViewById(R.id.view_pager);

        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        arrayList.add("Item 4");
        arrayList.add("Item 5");

        MyAdapter = new MyAdapter(this, arrayList);


        myViewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        myViewPager2.setAdapter(MyAdapter);
    }
}