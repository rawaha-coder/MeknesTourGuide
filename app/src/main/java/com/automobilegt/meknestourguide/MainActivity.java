package com.automobilegt.meknestourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.automobilegt.meknestourguide.adapter.LocationViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mainViewPager = findViewById(R.id.main_viewpager);
        LocationViewPagerAdapter adapter = new LocationViewPagerAdapter(getSupportFragmentManager(), this);
        mainViewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.main_tabs);
        tabLayout.setupWithViewPager(mainViewPager);
    }
}