package com.udicity.shams.tourinsuez.CafeShops;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.viewpager.widget.ViewPager;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class CafeActivity extends NavigationDrawerActivity {

    private ViewPager cafeViewPager;
    private CafeFragmentAdapter cafeFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.cafe_activity, frameLayout);

        cafeViewPager = findViewById(R.id.cafe_view_pager);
        cafeFragmentAdapter = new CafeFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        cafeViewPager.setAdapter(cafeFragmentAdapter);
        cafeViewPager.setVisibility(View.VISIBLE);
    }
}