package com.udicity.shams.tourinsuez.Help;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class HelpActivity extends NavigationDrawerActivity {

    ViewPager helpViewPager;
    private int selectedCategoryId;
    HelpFragmentAdapter helpFragmentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.help_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.help_activity, frameLayout);


        String selected_cat = getIntent().getStringExtra("categoryId");
        //selectedCategoryId = Integer.valueOf(selected_cat);

        helpViewPager = (ViewPager)findViewById(R.id.help_view_pager);
        helpFragmentAdapter = new HelpFragmentAdapter(getSupportFragmentManager(),getApplicationContext());

        helpViewPager.setAdapter(helpFragmentAdapter);
        helpViewPager.setVisibility(View.VISIBLE);
    }
}
