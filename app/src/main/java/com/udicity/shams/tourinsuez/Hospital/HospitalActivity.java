package com.udicity.shams.tourinsuez.Hospital;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class HospitalActivity extends NavigationDrawerActivity {

    ViewPager hospitalViewPager;
    HospitalFragmentAdapter hospitalFragmentAdapter;
    private int selectedCategoryId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.hospital_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.hospital_activity,frameLayout);

        String selected_cat = getIntent().getStringExtra("categoryId");

        hospitalFragmentAdapter = new HospitalFragmentAdapter(getSupportFragmentManager(),getApplicationContext());
        hospitalViewPager = (ViewPager)findViewById(R.id.hospital_view_pager);
        hospitalViewPager.setAdapter(hospitalFragmentAdapter);
        hospitalViewPager.setVisibility(View.VISIBLE);

    }
}
