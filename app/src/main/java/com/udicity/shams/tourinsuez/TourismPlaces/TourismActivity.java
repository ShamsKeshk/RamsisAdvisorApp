package com.udicity.shams.tourinsuez.TourismPlaces;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class TourismActivity extends NavigationDrawerActivity {

    ViewPager tourismViewPager;
    TourismFragmentAdapter tourismFragmentAdapter;
    private int selectedCategoryId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.tourism_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.tourism_activity , frameLayout);

        String selected_cat = getIntent().getStringExtra("categoryId");

        tourismViewPager = (ViewPager)findViewById(R.id.tourism_view_pager);
        TourismFragmentAdapter tourismFragmentAdapter = new TourismFragmentAdapter(getSupportFragmentManager(),getApplicationContext());
        tourismViewPager.setAdapter(tourismFragmentAdapter);
        tourismViewPager.setVisibility(View.VISIBLE);
    }
}
