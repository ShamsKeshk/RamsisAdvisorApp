package com.udicity.shams.tourinsuez.Restaurant;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class RestaurantActivity extends NavigationDrawerActivity {

    ViewPager restViewPager;
    RestaurantFragmentAdapter restaurantFragmentAdapter;
    private int selectedCategoryId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_activity);

        String selected_cat = getIntent().getStringExtra("categoryId");
//        selectedCategoryId = Integer.valueOf(selected_cat);
        restViewPager = (ViewPager)findViewById(R.id.rest_view_pager);
        restaurantFragmentAdapter = new RestaurantFragmentAdapter(getSupportFragmentManager(),this);
        restViewPager.setAdapter(restaurantFragmentAdapter);
        restViewPager.setVisibility(View.VISIBLE);
    }
}
