package com.udicity.shams.tourinsuez.NavigationDrawerPackage;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.udicity.shams.tourinsuez.AboutSuez.AboutSuezActivity;
import com.udicity.shams.tourinsuez.Events.EventsActivity;
import com.udicity.shams.tourinsuez.Help.HelpActivity;
import com.udicity.shams.tourinsuez.Hospital.HospitalActivity;
import com.udicity.shams.tourinsuez.R;
import com.udicity.shams.tourinsuez.Restaurant.RestaurantActivity;
import com.udicity.shams.tourinsuez.Shopping.ShoppingActivity;
import com.udicity.shams.tourinsuez.StoreShops.StoreActivity;
import com.udicity.shams.tourinsuez.TourismPlaces.TourismActivity;
import com.udicity.shams.tourinsuez.hotel.HotelActivity;

public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//    ViewPager storeViewPager;

//    private int selectedCategoryId;
//    ViewPager[] viewPagers;
// ArrayList<ViewPager> viewPagerArrayList;
//    <include layout="@layout/navigation_drawer_content" />





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
    }

//        String selected_cat = getIntent().getStringExtra("categoryId");
//        selectedCategoryId = Integer.valueOf(selected_cat);
//
//
//        storeViewPager = (ViewPager)findViewById(R.id.store_view_pager);
//        viewPagers = new ViewPager[Category.numberOfCategories];
//        viewPagers[6] = storeViewPager;






//        if (selectedCategoryId == 1){
//         aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
//         visibleViewPager(aboutSuezViewPager);
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
        int itemId = item.getItemId();

        if (itemId == R.id.about_suez_tab) {
            startActivity(new Intent(this, AboutSuezActivity.class));
//             Handle the camera action
//            invisibleAllViewPagers();
//            aboutSuezViewPager.setAdapter(aboutSuezFragmentAdapter);
//            visibleViewPager(aboutSuezViewPager);
        } else if (itemId == R.id.hotel_tab) {
            startActivity(new Intent(this, HotelActivity.class));
//            invisibleAllViewPagers();
//            hotelViewPager.setAdapter(hotelFragmentAdapter);
//            visibleViewPager(hotelViewPager);
        } else if (itemId == R.id.restaurant_tab) {
            startActivity(new Intent(this, RestaurantActivity.class));
        }else if (itemId == R.id.tourism_tab) {
            startActivity(new Intent(this, TourismActivity.class));
        }else if (itemId == R.id.event_tab) {
            startActivity(new Intent(this, EventsActivity.class));
        }else if (itemId == R.id.shopping_tab) {
            startActivity(new Intent(this, ShoppingActivity.class));
        }else if (itemId == R.id.store_tab) {
            startActivity(new Intent(this, StoreActivity.class));
        }else if (itemId == R.id.hospital_tab) {
            startActivity(new Intent(this, HospitalActivity.class));
        } else if (itemId == R.id.help_tab) {
            startActivity(new Intent(this, HelpActivity.class));
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
//    public void invisibleAllViewPagers()
//    {
//        for(int i=0;i<viewPagers.length ;i++)
//        {
//            viewPagers[i].setVisibility(View.GONE);
//        }
//    }
//    public void visibleViewPager(ViewPager viewPager) {
//        viewPager.setVisibility(View.VISIBLE);
//    }

}
