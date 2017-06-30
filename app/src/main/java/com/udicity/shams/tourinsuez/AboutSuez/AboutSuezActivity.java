package com.udicity.shams.tourinsuez.AboutSuez;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class AboutSuezActivity extends NavigationDrawerActivity {

    ViewPager aboutSuezViewPager;
    AboutSuezFragmentAdapter aboutSuezFragmentAdapter;
    private int selectedCategoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.about_suez_activity);
        FrameLayout frameLayout= (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.about_suez_activity,frameLayout);


        String selected_cat = getIntent().getStringExtra("categoryId");
        //selectedCategoryId = Integer.valueOf(selected_cat);

        aboutSuezViewPager = (ViewPager)findViewById(R.id.about_suez_view_pager);
        aboutSuezFragmentAdapter = new AboutSuezFragmentAdapter(getSupportFragmentManager(),this);

        aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
        aboutSuezViewPager.setVisibility(View.VISIBLE);

    }
}
