package com.udicity.shams.tourinsuez.Events;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class EventsActivity extends NavigationDrawerActivity {

    ViewPager eventsViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.events_activity);
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.events_activity,frameLayout);

        String selected_cat = getIntent().getStringExtra("categoryId");

        eventsViewPager = (ViewPager)findViewById(R.id.events_view_pager);
        EventsFragmentAdapter eventsFragmentAdapter = new EventsFragmentAdapter(getSupportFragmentManager(),getApplicationContext());
        eventsViewPager.setAdapter(eventsFragmentAdapter);
        eventsViewPager.setVisibility(View.VISIBLE);
    }
}
