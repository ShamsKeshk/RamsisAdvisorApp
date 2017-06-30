package com.udicity.shams.tourinsuez.Events;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udicity.shams.tourinsuez.R;

public class EventsActivity extends AppCompatActivity {

    ViewPager eventsViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_activity);

        String selected_cat = getIntent().getStringExtra("categoryId");

        eventsViewPager = (ViewPager)findViewById(R.id.events_view_pager);
    }
}
