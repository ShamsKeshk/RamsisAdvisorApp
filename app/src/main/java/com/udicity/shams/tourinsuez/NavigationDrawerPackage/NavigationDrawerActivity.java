package com.udicity.shams.tourinsuez.NavigationDrawerPackage;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezFragmentAdapter;
import com.udicity.shams.tourinsuez.CategoryPackage.Category;
import com.udicity.shams.tourinsuez.Help.HelpFragmentAdapter;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantFragmentAdapter;
import com.udicity.shams.tourinsuez.hotel.HotelFragmentAdapter;

import java.util.ArrayList;

public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager aboutSuezViewPager;
    ViewPager hotelViewPager;
    ViewPager restViewPager;
    ViewPager tourismViewPager;
    ViewPager eventsViewPager;
    ViewPager shoppingViewPager;
    ViewPager storeViewPager;
    ViewPager hospitalViewPager;
    ViewPager helpViewPager;

    int itemId;
    private int selectedCategoryId;
    ViewPager[] viewPagers;
   // ArrayList<ViewPager> viewPagerArrayList;



    AboutSuezFragmentAdapter aboutSuezFragmentAdapter;
    HotelFragmentAdapter hotelFragmentAdapter;
    RestaurantFragmentAdapter restaurantFragmentAdapter;
    HelpFragmentAdapter helpFragmentAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

      //  constraintLayout.removeView(textView);

        String selected_cat = getIntent().getStringExtra("categoryId");
        selectedCategoryId = Integer.valueOf(selected_cat);

        aboutSuezViewPager = (ViewPager)findViewById(R.id.about_suez_view_pager);
        hotelViewPager = (ViewPager)findViewById(R.id.hotel_view_pager);
        restViewPager = (ViewPager)findViewById(R.id.rest_view_pager);
        tourismViewPager = (ViewPager)findViewById(R.id.tourism_view_pager);
        eventsViewPager = (ViewPager)findViewById(R.id.events_view_pager);
        shoppingViewPager = (ViewPager)findViewById(R.id.shopping_view_pager);
        storeViewPager = (ViewPager)findViewById(R.id.store_view_pager);
        hospitalViewPager = (ViewPager)findViewById(R.id.hospital_view_pager);
        helpViewPager = (ViewPager)findViewById(R.id.help_view_pager);

        viewPagers = new ViewPager[Category.numberOfCategories];
        viewPagers[0] = aboutSuezViewPager;
        viewPagers[1] = hotelViewPager;
        viewPagers[2] = restViewPager;
        viewPagers[3] = tourismViewPager;
        viewPagers[4] = eventsViewPager;
        viewPagers[5] = shoppingViewPager;
        viewPagers[6] = storeViewPager;
        viewPagers[7] = hospitalViewPager;
        viewPagers[8] = helpViewPager;






        aboutSuezFragmentAdapter = new AboutSuezFragmentAdapter(getSupportFragmentManager(),this);
        hotelFragmentAdapter = new HotelFragmentAdapter(getSupportFragmentManager(),this);
        restaurantFragmentAdapter = new RestaurantFragmentAdapter(getSupportFragmentManager(),this);
        helpFragmentAdapter = new HelpFragmentAdapter(getSupportFragmentManager(),getApplicationContext());


        if (selectedCategoryId == 1)
        {
            aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
            visibleViewPager(aboutSuezViewPager);
        }else if(selectedCategoryId == 2)
        {
            hotelViewPager.setAdapter(hotelFragmentAdapter);
            visibleViewPager(hotelViewPager);
        }else if(selectedCategoryId == 3) {
            restViewPager.setAdapter(restaurantFragmentAdapter);
            visibleViewPager(restViewPager);
        }else if(selectedCategoryId == 9)
        {
            helpViewPager.setAdapter(helpFragmentAdapter);
            visibleViewPager(helpViewPager);
                Toast.makeText(getApplicationContext(), "i am help", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
         itemId = item.getItemId();

        if (itemId == R.id.about_suez_tab) {
            // Handle the camera action
            invisibleAllViewPagers();
            aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
            visibleViewPager(aboutSuezViewPager);
        } else if (itemId == R.id.hotel_tab) {
            invisibleAllViewPagers();
            hotelViewPager.setAdapter(hotelFragmentAdapter);
            visibleViewPager(hotelViewPager);
        } else if (itemId == R.id.tourism_tab) {

        } else if (itemId == R.id.nav_share) {

        } else if (itemId == R.id.nav_send) {

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void invisibleAllViewPagers()
    {
        for(int i=0;i<viewPagers.length ;i++)
        {
            viewPagers[i].setVisibility(View.GONE);
        }

    }
    public void visibleViewPager(ViewPager viewPager) {
        viewPager.setVisibility(View.VISIBLE);
    }

}
