package com.udicity.shams.tourinsuez.Shopping;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class ShoppingActivity extends NavigationDrawerActivity {

    ViewPager shoppingViewPager;
    ShoppingFragmentAdapter shoppingFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.shopping_activity,frameLayout);

        shoppingViewPager = (ViewPager)findViewById(R.id.shopping_view_pager);
        shoppingFragmentAdapter = new ShoppingFragmentAdapter(getSupportFragmentManager(),getApplicationContext());
        shoppingViewPager.setAdapter(shoppingFragmentAdapter);
        shoppingViewPager.setVisibility(View.VISIBLE);
    }
}