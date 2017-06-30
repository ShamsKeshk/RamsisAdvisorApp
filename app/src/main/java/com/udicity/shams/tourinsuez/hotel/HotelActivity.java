package com.udicity.shams.tourinsuez.hotel;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class HotelActivity extends NavigationDrawerActivity {

    ViewPager hotelViewPager;
    HotelFragmentAdapter hotelFragmentAdapter;
    private int selectedCategoryId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.hotel_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.hotel_activity,frameLayout);


        String selected_cat = getIntent().getStringExtra("categoryId");
//        selectedCategoryId = Integer.valueOf(selected_cat);

        hotelViewPager = (ViewPager)findViewById(R.id.hotel_view_pager);

        hotelFragmentAdapter = new HotelFragmentAdapter(getSupportFragmentManager(),this);

        hotelViewPager.setAdapter(hotelFragmentAdapter);
        hotelViewPager.setVisibility(View.VISIBLE);

    }
}
