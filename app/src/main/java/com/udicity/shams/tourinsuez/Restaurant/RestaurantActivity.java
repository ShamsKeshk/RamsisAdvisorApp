package com.udicity.shams.tourinsuez.Restaurant;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class RestaurantActivity extends NavigationDrawerActivity {

    ViewPager restViewPager;
    RestaurantFragmentAdapter restaurantFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.restaurant_activity , frameLayout);

        restViewPager = (ViewPager)findViewById(R.id.rest_view_pager);
        restaurantFragmentAdapter = new RestaurantFragmentAdapter(getSupportFragmentManager(),this);
        restViewPager.setAdapter(restaurantFragmentAdapter);
        restViewPager.setVisibility(View.VISIBLE);
    }
}