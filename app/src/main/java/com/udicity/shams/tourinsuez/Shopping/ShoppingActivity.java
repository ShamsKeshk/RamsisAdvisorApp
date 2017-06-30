package com.udicity.shams.tourinsuez.Shopping;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.R;

public class ShoppingActivity extends AppCompatActivity {

    ViewPager shoppingViewPager;
    ShoppingFragmentAdapter shoppingFragmentAdapter;
    private int selectedCategoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.shopping_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.shopping_activity,frameLayout);

        String selected_cat = getIntent().getStringExtra("categoryId");


        /*
        shoppingViewPager = (ViewPager)findViewById(R.id.shopping_view_pager);

        shoppingViewPager.setAdapter(shoppingFragmentAdapter);
        shoppingViewPager.setVisibility(View.VISIBLE);

        */


    }
}
