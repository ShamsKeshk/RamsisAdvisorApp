package com.udicity.shams.tourinsuez.Shopping;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.viewpager.widget.ViewPager;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class ShoppingActivity extends NavigationDrawerActivity {

    private ViewPager shoppingViewPager;
    private ShoppingFragmentAdapter shoppingFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.shopping_activity, frameLayout);

        shoppingViewPager = findViewById(R.id.shopping_view_pager);
        shoppingFragmentAdapter = new ShoppingFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        shoppingViewPager.setAdapter(shoppingFragmentAdapter);
        shoppingViewPager.setVisibility(View.VISIBLE);
    }
}