package com.udicity.shams.tourinsuez.AboutSuez;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class AboutSuezActivity extends NavigationDrawerActivity {

    private ViewPager aboutSuezViewPager;
    private AboutSuezFragmentAdapter aboutSuezFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.about_suez_activity, frameLayout);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.about_suez_tab_view_pager);

        aboutSuezViewPager = (ViewPager) findViewById(R.id.about_suez_view_pager);
        aboutSuezFragmentAdapter = new AboutSuezFragmentAdapter(getSupportFragmentManager(), this);
        aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
        aboutSuezViewPager.setVisibility(View.VISIBLE);
        tabLayout.setupWithViewPager(aboutSuezViewPager);
    }
}