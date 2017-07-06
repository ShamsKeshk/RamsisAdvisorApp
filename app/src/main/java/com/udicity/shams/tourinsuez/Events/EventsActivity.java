package com.udicity.shams.tourinsuez.Events;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;

import com.udicity.shams.tourinsuez.NavigationDrawerPackage.NavigationDrawerActivity;
import com.udicity.shams.tourinsuez.R;

public class EventsActivity extends NavigationDrawerActivity {

    private ViewPager eventsViewPager;
    private EventsFragmentAdapter eventsFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.navigation_drawer_content_frame_layout_id);
        getLayoutInflater().inflate(R.layout.events_activity, frameLayout);

        eventsViewPager = (ViewPager) findViewById(R.id.events_view_pager);
        eventsFragmentAdapter = new EventsFragmentAdapter(getSupportFragmentManager(), getApplicationContext());
        eventsViewPager.setAdapter(eventsFragmentAdapter);
        eventsViewPager.setVisibility(View.VISIBLE);
    }
}