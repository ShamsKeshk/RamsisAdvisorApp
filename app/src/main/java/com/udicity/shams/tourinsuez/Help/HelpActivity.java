package com.udicity.shams.tourinsuez.Help;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.viewpager.widget.ViewPager;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class HelpActivity extends NavigationDrawerActivity {

    private ViewPager helpViewPager;
    private HelpFragmentAdapter helpFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.help_activity, frameLayout);

        helpViewPager = findViewById(R.id.help_view_pager);
        helpFragmentAdapter = new HelpFragmentAdapter(getSupportFragmentManager(), getApplicationContext());

        helpViewPager.setAdapter(helpFragmentAdapter);
        helpViewPager.setVisibility(View.VISIBLE);
    }
}